package main.lesson2;

public class lesson2 {
    static int sizeX = 4;
    static int sizeY = 4;

    static String [][] arrayCorrect = {{"2","6","1","1"},{"1","9","9","7"},{"2","0","2","2"},{"2","0","1","8"}};
    static String [][] arraySize = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    static String [][] arrayData = {{"2","7","8","1"},{"1",">","9","1"},{"5","0","2","6"},{"7","0","1","2"}};

    public static void main(String[] args) {
        arrayCorrectSumm ();
        arraySizeSumm ();
        arrayDataSumm ();
    }

    static void checkValue(String[][] array) throws MyArraySizeException{
        if(array.length!=sizeX || array[0].length!=sizeY) throw new MyArraySizeException();
    }

    static Integer getSumm(String[][] array) throws MyArraySizeException, MyArrayDataException{
        checkValue(array);
        Integer result=0;
        int i = 0;
        int j = 0;
        try {
            for(i=0; i<array.length; i++) {
                for(j=0; j<array.length; j++) {
                    result = result + Integer.parseInt(array[i][j]);
                }
            }
        }
        catch (NumberFormatException ex) {
            throw new MyArrayDataException("Неверные данные в ячейке: "+i+","+j);
        }
        return result;
    }

    public static void arrayCorrectSumm() {
        try {
            System.out.println("Сумма массива = " + getSumm(arrayCorrect));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void arraySizeSumm () {
        try {
            System.out.println("Сумма массива = " + getSumm(arraySize));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void arrayDataSumm () {
        try {
            System.out.println("Сумма массива = " + getSumm(arrayData));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static class MyArraySizeException extends Exception {
        public MyArraySizeException(){
            super("Неверен размер массива");
        }
    }

    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }
}
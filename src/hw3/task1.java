package hw3;

import java.util.Arrays;

public class task1 {
    static String[] arrayString = {"9", "5", "1", "6"};

    public static void main(String[] args) {
        arrayClass<Object> ArrayClass = new arrayClass<>();
        try {
            System.out.println(Arrays.toString(ArrayClass.swapElements(arrayString, 0, 3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}

package hw;

import java.util.ArrayList;

public class Box <T extends fruit>{
    T[] fruitArray;

    public Box(T[] fruitArray) {
        this.fruitArray = fruitArray;
    }

    public Integer getWeight(){
        Integer result = 0;
        for(T t: getFruitArray()){
            if(t!=null) {
                Integer value = t.getWeight();
                result = result + value;
            }
        }
        return result;
            }

    public boolean compare(Box<? extends fruit> Box){
        if(this.getWeight().intValue() == Box.getWeight().intValue()) return true;
        return false;
    }
    public void toEmptyArray(Box<T> box){
        for(int i = 0; i<box.getFruitArray().length;i++){
            if(box.getFruitArray()[i]!=null) {
                this.getFruitArray()[getSize()] = box.getFruitArray()[i];
                box.getFruitArray()[i] = null;
            }
        }
        System.out.println(box.getWeight());
    }
    private int getSize(){
        int result = 0;
        for(T t: getFruitArray()){
            if(t!=null)result++;
        }
        return result;
    }

    public T[] getFruitArray() {
        return fruitArray;
    }
}

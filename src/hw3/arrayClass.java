package hw3;

public class arrayClass <T> {

    T intermediate;
    public T[] swapElements(T[] array, int indexA, int indexB) {
        intermediate = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = intermediate;
        return array;
    }
}
package hw;

public class Main {

        public static void main(String[] args) {

            Apple[] apples = new Apple[10];
            Orange[] oranges = new Orange[10];
            Apple[] apples2 = new Apple [10];

            Apple apple1 = new Apple(175);
            Apple apple2 = new Apple(175);
            Apple apple3 = new Apple(175);

            Orange orange1 = new Orange(200);
            Orange orange2 = new Orange(200);

            Box<Apple> box1 = new Box<Apple>(apples);
            Box<Apple> box2 = new Box<Apple>(apples2);
            Box<Orange> box3 = new Box<Orange>(oranges);

            System.out.println(box1.compare(box2));
            System.out.println(box1.getWeight());

            box1.toEmptyArray(box2);

            System.out.println(box2);

            box1.compare(box3);
            Box<fruit> box10 = new Box<fruit>(apples);

        }
}

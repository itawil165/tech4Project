package oop_principles.class_objects;

public class AppleTest {
    public static void main(String[] args) {

        // Create 2 Apple Objects

        Apple apple1 = new Apple();
        apple1.color = "Red";
        apple1.taste = "Sweet";
        apple1.price = 0.99;
        System.out.println(apple1.color);
        System.out.println(apple1.taste);
        System.out.println(apple1.price);

        Apple apple2 = new Apple(2);
        System.out.println(apple2.color); // null since no value has been declared
        System.out.println(apple2.taste); // null since no value has been declared
        System.out.println(apple2.price); // 0.0  since no value has been declared

        Apple apple3 = new Apple("apple", 3);

    }
}

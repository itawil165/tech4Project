package oop_principles.class_objects;

public class Apple {

    // Default constructor
    public Apple(){
        System.out.println("Apple 1 is: ");
    }

    // One-arg constructor
    public Apple(int number){
        System.out.println("One arg constructor is invoked by " + number);
    }

    public Apple(String str, int number){
        System.out.println("One arg constructor has been invoked by " + str + " and " + number);
    }

    // Define instance variables (color, taste, price, etc)
    public String color;
    public String taste;
    public double price;

}

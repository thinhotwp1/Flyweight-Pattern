package org.example;

public class Circle implements Shape {
    private final String color; // Intrinsic State

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(String location) {
        System.out.println("Drawing a " + color + " circle at " + location);
    }
}

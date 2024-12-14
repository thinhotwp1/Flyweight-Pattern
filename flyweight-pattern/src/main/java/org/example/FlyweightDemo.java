package org.example;

public class FlyweightDemo {
//    Flyweight create one instance of object, which have same properties -> save memory because no need create many object
    public static void main(String[] args) {
        Shape redCircle1 = ShapeFactory.getCircle("Red"); // Created a new circle with color: Red
        Shape redCircle2 = ShapeFactory.getCircle("Red");
        Shape blueCircle = ShapeFactory.getCircle("Blue"); // Created a new circle with color: Blue

        redCircle1.draw("Location 1"); // Drawing a Red circle at Location 1
        redCircle2.draw("Location 2"); // Drawing a Red circle at Location 2
        blueCircle.draw("Location 3"); // Drawing a Blue circle at Location 3
    }
}

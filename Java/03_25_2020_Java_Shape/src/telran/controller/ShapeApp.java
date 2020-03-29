package telran.controller;

import telran.data.*;

public class ShapeApp {
    public static void main(String[] args) {
        Square sq1 = new Square(Color.BLACK, 21);
        Square sq2 = new Square(Color.RED, 15);
        Square sq3 = new Square(Color.GREEN, 40);

        Circle c1 = new Circle(Color.BLUE, 12);
        Circle c2 = new Circle(Color.RED, 25);
        Circle c3 = new Circle(Color.YELLOW, 5);

        Rectangle r1 = new Rectangle(Color.BLUE, 10, 5);
        Rectangle r2 = new Rectangle(Color.RED, 17, 25);
        Rectangle r3 = new Rectangle(Color.GREEN, 20, 50);

        Shape[] shapes = {sq1, sq2, sq3, c1, c2, c3, r1, r2, r3 };


//        displayArray(shapes);


        System.out.println(Shape.findMaxShapeByArea(shapes));
        System.out.println(Shape.findMaxShape(shapes));

        System.out.println("====================");
        Shape[] shapesByColor = Shape.getByColor(shapes,"green");
        displayArray(shapesByColor);

        System.out.println(" ");
        System.out.println("=========== showing shapes by class name ==============");
        Shape[] shapesByClass = Shape.findElementByClass(shapes, "Circle");
        displayArray(shapesByClass);
    }

    static void displayArray (Object[] objects){
        for (Object o: objects) {
            System.out.println(o);
        }
    }


}

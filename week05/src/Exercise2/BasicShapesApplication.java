package week05.src.Exercise2;

import week05.src.Exercise1.Circle;
import week05.src.Exercise1.Shape;

import java.util.ArrayList;
import java.util.List;

public class BasicShapesApplication {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Shape: " + circle.getName());
        Square square = new Square();
        System.out.println("Shape: " + square.getName());
        Triangle triangle = new Triangle();
        System.out.println("Shape: " + triangle.getName());
        List <Shape> circles = new ArrayList <>();
        circles.add(circle);
        circles.add(triangle);
        circles.add(square);
        System.out.println("Shapes: " + circles);
        for (Shape shape : circles) {
            System.out.println("Shapes name: " + shape);
        }


    }
}

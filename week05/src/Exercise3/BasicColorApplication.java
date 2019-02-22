package week05.src.Exercise3;

import week05.src.Exercise1.Shape;

import java.util.ArrayList;
import java.util.List;

public class BasicColorApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Name: " + rectangle.getName());

        Colored colored = (Colored) rectangle;
        System.out.println("Colord: " + colored.getColor());

        Shape shape = (Shape) rectangle;
        System.out.println("Shape: " + shape.getName());

        List <Rectangle> rectangles = new ArrayList <>();
        rectangles.add(rectangle);
        List <Colored> coloreds = new ArrayList <>();
        coloreds.add(colored);
        coloreds.add(rectangle);
        List <Shape> shapes = new ArrayList <>();
        shapes.add(shape);
        shapes.add(rectangle);
        System.out.println(rectangles);
        System.out.println(coloreds);
        System.out.println(shapes);


    }
}

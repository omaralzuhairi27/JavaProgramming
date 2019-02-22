package week05.src.Exercise3;

import week05.src.Exercise1.Shape;

public class Rectangle implements Colored, Shape {

    private String name = "rectangle";
    private String color = "red";

    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name + " " + color;

    }
}

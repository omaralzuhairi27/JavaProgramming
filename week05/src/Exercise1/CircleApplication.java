package week05.src.Exercise1;

public class CircleApplication {
    public static void main(String[] args) {
        System.out.println("Class: "+new Circle().getName());
        Shape shape=new Circle();
        System.out.println("Shape: "+shape.getName());
        Circle circle=new Circle();
        Shape anotherShape=circle;
        System.out.println("anotherShape: "+anotherShape.getName());

    }
}

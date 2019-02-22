package week05.src.Exercise1;

public class Circle implements Shape {

    private String word="circle";
    @Override
    public String getName() {
        return word;
    }

    @Override
    public String toString() {
        return word ;
    }
}

package week05.src.Exercise6;

public class IkeaApplication {
    public static void main(String[] args) {
        WardrobeBuilder wardrobeBuilder=new WardrobeBuilder();
        System.out.println(wardrobeBuilder.build().parts);
    }
}

package week05.src.Reflection;

public class IkeaApp {
    public static void main(String[] args) {
        TvTableBuilder tvTableBuilder = new TvTableBuilder();

        System.out.println(tvTableBuilder
                .build().parts);
    }
}

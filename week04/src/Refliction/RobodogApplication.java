package week04.src.Refliction;

import week04.src.Exercise9.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RobodogApplication {
    public static void main(String[] args) {
        // FileReader reader=new FileReader();
        redTheFile();

    }

    public static void redTheFile() {
        FileReader reader = new FileReader();
        List <String> lines = reader.getLine("Refliction/robodog.txt");
        List <String> texts = getTheText(lines);
        for (String text : texts) {
            System.out.println(text);
        }


    }

    private static List <String> getTheText(List <String> lines) {
        List <String> texts = new ArrayList <>();
        for (String line : lines) {
            String text = getTheWord(line);
            texts.add(text);
        }
        return texts;
    }

    private static String getTheWord(String line) {
        String[] split = line.split("");
        List <String> columns = Arrays.asList(split);
        List <String> newColumns = new ArrayList <>();
        for (int i = 0; i < columns.size(); i++) {
            String value = columns.get(i).replaceAll("!", "");
            newColumns.add(value);
        }

        String text = String.join("", newColumns);

        return text;
    }


}

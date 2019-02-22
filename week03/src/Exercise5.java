package week03.src;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        List<String> newWords = new ArrayList<>();
        List<String> words = new ArrayList<>();
        words.add("House");
        words.add("tree");
        words.add("theatre");
        words.add("somewhere");
        words.add("bottle");
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            String wordPart = word.substring(0, 2);
            newWords.add(wordPart);

        }
        System.out.println(newWords);
    }
}

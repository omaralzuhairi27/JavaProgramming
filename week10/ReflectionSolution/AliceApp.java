package week10.ReflectionSolution;

import java.util.List;

public class AliceApp {

    public static void main(String[] args) {
        List<String> words = new WordReader().getWords("week10/ReflectionSolution/alice.txt");
        WordSummarizer wordSummarizer = new WordSummarizer();
        LetterSummarizer letterSummarizer = new LetterSummarizer();

        System.out.println("Number of words: " + wordSummarizer.count(words));
        System.out.println("Number of distinct words: " + wordSummarizer.countDistinct(words));
        System.out.println("Longest words: " + wordSummarizer.getLongest(words));
        System.out.println("Most appearing 5 words: ");
        wordSummarizer.get5MostAppearing(words)
                .forEach(System.out::println);
        System.out.println("Most appearing 5 letters: ");
        letterSummarizer.get5MostAppearingLetters(words)
                .forEach(System.out::println);
        System.out.println("Alice appearances: " + wordSummarizer.count("Alice", words));
    }

}

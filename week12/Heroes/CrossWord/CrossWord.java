package week12.Heroes.CrossWord;

import java.util.*;
import java.util.stream.Collectors;

public class CrossWord {

    public static void main(String[] args) {

        CrossWord crossWord = new CrossWord();
        String[][] randomBlocks = crossWord.createRandomBlocks(10);
        String[][] strings = crossWord.fillRows(randomBlocks);

        for (int i = 0; i < randomBlocks.length; i++) {
            for (int j = 0; j < randomBlocks.length; j++) {
                System.out.print(strings[i][j]);

            }
            System.out.println();

        }
    }

    public String[][] fillRows(String[][] puzzleBorad) {
        String wordAsLongOfRow = getWordAsLongOfRow(10);
        System.out.println(wordAsLongOfRow);
        for (int i = 0; i < puzzleBorad.length; i++) {
                    puzzleBorad[0][i] = Character.toString(wordAsLongOfRow.charAt(i));

        }


           // }

        return puzzleBorad;
    }


    public List <String> getWordAsSize(Integer size) {
        List <String> words = ReadWords.asList();
        // System.out.println(words);
        int number = (int) (Math.random() * 12) + 0;
        System.out.println(number);
        List <String> wordsInSameSize = new ArrayList <>();
        for (int i = size; i >= 0; i--) {
            if (words.get(i).length() <= number) {
                wordsInSameSize.add(words.get(i));
            }

        }
        for (String word : words) {
            if (word.length() == size) {

            }
            size--;
        }
        System.out.println(wordsInSameSize);

        Collections.shuffle(wordsInSameSize);
        String[] wordsInArrayRow = new String[wordsInSameSize.size()];
        wordsInArrayRow = wordsInSameSize.toArray(wordsInArrayRow);

        return wordsInSameSize;
    }

    public String[][] createRandomBlocks(Integer size) {
        String[][] puzzleBorad = new String[size][size];
        List <String> words = ReadWords.asList();
        for (String word : words) {
            List <String> list = Arrays.asList(word.split(""));
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < puzzleBorad.length; j++) {
                puzzleBorad[i][j] = "1";
            }
        }

        createRandomBlocks(size, puzzleBorad);

        return puzzleBorad;
    }

    private void createRandomBlocks(Integer size, String[][] puzzleBorad) {
        Integer blackBox = size * 2;
        while (blackBox > 0) {
            int number = (int) (Math.random() * size) + 0;
            int number2 = (int) (Math.random() * size) + 0;
            for (int i = 0; i < puzzleBorad.length; i++) {
                puzzleBorad[number][number2] = String.valueOf(0);
            }
            blackBox--;
        }
    }

    public String getWordAsLongOfRow(Integer length) {
        String allWordAsLetter = getString(length);
        return allWordAsLetter;
    }

    private String getString(Integer length) {
        List <String> words = ReadWords.asList();
        Map <Integer, List <String>> collect = words.stream()
                .collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()));

        List <String> wordAsSize = new ArrayList <>();
        Collections.shuffle(words);
        Random random=new Random();
        int wordLength=length;
        int allWordsLength=0;
        int remain=0;
            while(wordLength>1){
                if(wordLength>=0){
                    int min=length-allWordsLength;
                    Optional <String> first = words.stream()
                            .filter(e -> e.length() == min)
                            .findFirst();
                    wordAsSize.add(first.get());
                   // System.out.println("word Length " + (length-allWordsLength));
                }
                wordAsSize.add(words.get(0));
                System.out.println("Word size "+ words.get(0).length());
                wordLength=wordLength-words.get(0).length();
                System.out.println("wordLength "+wordLength);
                allWordsLength+=words.get(0).length();
                words.remove(0);


            }



        return getAllWordAsLetter(wordAsSize);
    }



    public String getAllWordAsLetter(List <String> words) {
        String collect = words.stream()
                .map(e -> e.toString())
                .reduce("", String::concat);

        return collect;
    }
}
/*
        String[][] test=crossWord.createRandomBlocks(10);

        for (int i = 0; i <test.length ; i++) {
            for (int j = 0; j < test.length; j++) {
                System.out.print(test[i][j]+" ");

            }
            System.out.println();

        }
        List<String> words=ReadWords.asList();
        System.out.println(words);
*/




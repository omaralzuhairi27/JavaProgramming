package MTWeek3.src.Exetcise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Encryptor {
    public String enctyptLetter(String text) {
        text = text.replaceAll("A", "4");
        text = text.replaceAll("a", "4");
        text = text.replaceAll("E", "3");
        text = text.replaceAll("e", "3");
        text = text.replaceAll("I", "1");
        text = text.replaceAll("i", "1");
        text = text.replaceAll("O", "8");
        text = text.replaceAll("o", "8");
        text = text.replaceAll("U", "9");
        text = text.replaceAll("u", "9");
        return text;
    }

    public String encryptNummber(String text) {


        text = text.replaceAll("1", "one");
        text = text.replaceAll("2", "two");
        text = text.replaceAll("3", "three");
        text = text.replaceAll("4", "four");
        text = text.replaceAll("5", "five");
        text = text.replaceAll("6", "six");
        text = text.replaceAll("7", "seven");
        text = text.replaceAll("8", "eight");
        text = text.replaceAll("9", "nine");
        return text;
    }

    public String encryptMathematicalSymbols(String text) {

        text = text.replaceAll("plus", "\\+");
        text = text.replaceAll("minus", "-");
        text = text.replaceAll("multiply", "\\*");
        text = text.replaceAll("divide", "/");
        return text;
    }

    public List <String> encryptedText(String text) {
        List <String> immutableSymbols = Arrays.asList("!", "@", "#", "$", "%", "&", "*", "+", "-", "=");
        List <String> symbols = new ArrayList <>(immutableSymbols);

        List <String> newText; //= new ArrayList <>();
        String[] words = text.split("");
        newText = Arrays.asList(words);
        List <String> mutableText = new ArrayList <>(newText);


        List <String> encryptedText = new ArrayList <>();
        Random random = new Random();

        for (int i = 0; i < mutableText.size(); i++) {
            String textValue = mutableText.get(i);
            encryptedText.add(textValue);
            Integer randomNumber = random.nextInt(5) + 1;
            for (int j = 0; j < randomNumber; j++) {
                String sumbolValue = immutableSymbols.get(random.nextInt(9)+1);
                encryptedText.add(sumbolValue);
            }
        }

        return encryptedText;
    }

    public String ListToString(List <String> list) {
        String text = String.join("", list);

        return text;
    }


}

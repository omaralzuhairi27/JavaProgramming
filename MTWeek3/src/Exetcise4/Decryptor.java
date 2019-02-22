package MTWeek3.src.Exetcise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.*;

public class Decryptor {
    public String dectyptLetter(String text){
        text=  text.replaceAll("4","A");
        text=  text.replaceAll("4","a");
        text=  text.replaceAll("3","E");
        text=  text.replaceAll("3","e");
        text=  text.replaceAll("1","I");
        text=  text.replaceAll("1","i");
        text=  text.replaceAll("8","O");
        text=  text.replaceAll("8","o");
        text=  text.replaceAll("9","U");
        text=  text.replaceAll("9","u");
        return text;
    }
    public String decryptNummber(String text) {


        text = text.replaceAll("one", "1");
        text = text.replaceAll("two", "2");
        text = text.replaceAll("three", "3");
        text = text.replaceAll("four", "4");
        text = text.replaceAll("five", "5");
        text = text.replaceAll("six", "6");
        text = text.replaceAll("seven", "7");
        text = text.replaceAll("eight", "8");
        text = text.replaceAll("nine", "9");
        return text;
    }
    public String decryptMathematicalSymbols(String text) {

        text = text.replaceAll("\\+", "plus");
        text = text.replaceAll("-", "minus");
        text = text.replaceAll("\\*", "multiply");
        text = text.replaceAll("/", "divide");
        return text;
    }
    public List<String> decryptedText(String text){
        List <String> immutableSymbols = Arrays.asList("!", "@", "#", "$", "%", "&", "*", "+", "-", "=");
        List <String> symbols = new ArrayList <>(immutableSymbols);
        List <String> newText = new ArrayList <>();
        String[] words = text.split("");
        newText = Arrays.asList(words);
        List <String> mutableText = new ArrayList <>(newText);

        for (int i = 0; i <mutableText.size() ; i++) {
            for (int j = 0; j <immutableSymbols.size() ; j++) {
                if(mutableText.get(i).equals(immutableSymbols.get(j)))
                    mutableText.add(i,"");

            }

        }
        return mutableText;
    }

    public String ListToString(List<String> list){
        String text=String.join("",list);

        return text;
    }


}


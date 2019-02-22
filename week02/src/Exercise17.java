package week02.src;

import java.util.ArrayList;
import java.util.List;

public class Exercise17 {

    public static void main(String[] args) {





        String sentens="PLEASE NO ADVERTISEMENT";
      Integer size=  sentens.length();
        System.out.println(sentens.toLowerCase() + size);
        List<String> changedwords= new ArrayList<>();
        List<String>  words=new ArrayList<>();
        words.add("PLEASE");
        words.add("NO");
        words.add("ADVERTISEMENT");
        String word1=words.get(0);
        words.remove(0);
        word1=word1.toLowerCase();
        changedwords.add(word1);

        String word2=words.get(0);
        words.remove(0);
        //word2=word2.toLowerCase();
        changedwords.add(word2);

        String word3=words.get(0);
        words.remove(0);
        word3=word3.toLowerCase();
        changedwords.add(word3);

       // Integer size1=word.length();
       // Integer test=word.length();
        System.out.println(changedwords);


    }
}

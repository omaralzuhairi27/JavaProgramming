package week07.src.Exercise5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {


    public Boolean isPalindrome(String word){
        String[] immutable = word.split("");
        List <String> mutable = Arrays.asList(immutable);
        Collections.reverse(mutable);
        String reverseWord = String.join("", mutable);

        if (word.equals(reverseWord)){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Palindrome palindrome=new Palindrome();

        System.out.println(palindrome.isPalindrome("madam"));
        ;
    }
}

package week02.src;

import java.util.Scanner;

public class Exercise18 {
    public void  formatToBracketsCI(String word){
        Integer length=word.length();
        char firstletterAsChar=word.charAt(0);
        String firstLetter=Character.toString(firstletterAsChar);
        firstLetter= firstLetter.toUpperCase();
        //System.out.println("the first letter "+firstLetter);

        String midlleWord=word.substring(1,length-1);
        midlleWord=midlleWord.toLowerCase();
        //System.out.println("the midlle letter "+midlleWord);

        char lastletterAsChar=word.charAt(length-1);
        String lastLetter=Character.toString(lastletterAsChar);
        lastLetter= lastLetter.toUpperCase();
        System.out.println("the New Word: "+firstLetter+midlleWord+lastLetter);



    }

    public static void main(String[] args) {
        Exercise18 exercise18=new Exercise18();
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Word");
        String enterWord=scanner.nextLine();
        exercise18.formatToBracketsCI(enterWord);
       // System.out.println(enterWord);

       // exercise18.formatToBracketsCI("halloword");
    }
}

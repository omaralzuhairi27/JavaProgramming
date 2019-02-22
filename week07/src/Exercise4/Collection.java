package week07.src.Exercise4;

import java.util.Arrays;
import java.util.List;

public class Collection {
    public static List <String> changeIntToList(Integer number) {
        String stringNumber = number.toString();
        String[] immutableList = stringNumber.split("");
        List <String> mutableList = Arrays.asList(immutableList);
        return mutableList;

    }

    public static void main(String[] args) {
        Integer firstNum = 4653;
        Integer secondNum = 193822;
        System.out.println("Input number: " + firstNum + "| Output collection: " + changeIntToList(firstNum));
        System.out.println("Input number: " + secondNum + "| Output collection: " + changeIntToList(secondNum));


    }
}

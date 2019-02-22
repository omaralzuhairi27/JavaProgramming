package week07.src.Exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckTheNumber {

    public static Integer checkBigestNumber(Integer number){
        String word=number.toString();
        List<String> listWord= Arrays.asList(word.split(""));

        List<String> numbers=new ArrayList <>();
        for (int i = 0; i <listWord.size() ; i++) {
            numbers.add(listWord.get(i));

        }
        Integer result=0;
        for (int i = 0; i <numbers.size() ; i++) {
            if(Integer.valueOf(numbers.get(i))>=result){
                result=Integer.valueOf(numbers.get(i));
            }
        }
        return result;
    }
    public static Integer checkAmalltestNumber(Integer number){
        String word=number.toString();
        List<String> listWord= Arrays.asList(word.split(""));

        List<String> numbers=new ArrayList <>();
        for (int i = 0; i <listWord.size() ; i++) {
            numbers.add(listWord.get(i));

        }
        Integer result=9;
        for (int i = 0; i <numbers.size() ; i++) {
            if(Integer.valueOf(numbers.get(i))<=result){
                result=Integer.valueOf(numbers.get(i));
            }
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(checkBigestNumber(234565894));
        System.out.println(checkAmalltestNumber(234565894));
    }
}

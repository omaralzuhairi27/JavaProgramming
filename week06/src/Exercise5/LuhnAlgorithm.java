package week06.src.Exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuhnAlgorithm {
    public static Boolean validateCardNumber(Long number1){
      String  number=number1.toString();
      String[] split=number.split("");
        List<String> numbers= Arrays.asList(split);
        List<String> newNumbers=new ArrayList<>(numbers);
        //System.out.println(newNumbers);
        for (int i = newNumbers.size()-2; i >=0 ; i=i-2) {
            Integer j=Integer.parseInt(newNumbers.get(i));
            j=j*2;
            if (j>9){
                j=j%10+1;
            }
            String k=j.toString();
            newNumbers.remove(i);
            newNumbers.add(i,k);


        }
       // System.out.println(newNumbers);
        Integer sum=0;
        for (int i = 0; i <newNumbers.size() ; i++) {
            sum+=Integer.parseInt(newNumbers.get(i));
        }
        if (sum%10==0){
            return true;
        }
        return false;
    }
}



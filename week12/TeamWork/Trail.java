package week12.TeamWork;

import java.util.ArrayList;
import java.util.List;

public class Trail {
    public static void main(String[] args) {
        String input="10 FFLFRFRFFLFLFRFF 5 L 1 FFFRFLFLFRFF 4 L 1 FFLFRFRFFLFLFRFF 8 L 1 FFLFRFRFFLFLFRFF 4 L 1 FFFFFF 3 R 1";


        List<Integer> test=new ArrayList <>();

        String[] items = input.split(" ");

       // Integer count=0;
        for (int i = 1; i <items.length ; i+=2) {
            Integer count=0;
                if(items[i].contains("F")){
                    String elm=items[i];
                    for (int j = 0; j <elm.length() ; j++) {
                        String letter=String.valueOf(elm.charAt(j));
                        if(letter.equals("F")){
                            count=count+1;
                        }
                    }
                    test.add(Integer.valueOf(items[i+1])*count);
                }
        }
        System.out.println(test);
        Integer sum=0;
        for (Integer integer : test) {
            sum+=integer;

        }
        System.out.println(sum);
    }

}


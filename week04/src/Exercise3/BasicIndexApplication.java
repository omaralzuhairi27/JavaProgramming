package week04.src.Exercise3;

import java.util.HashMap;
import java.util.Map;

public class BasicIndexApplication {
    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap <>();
        System.out.println("Map Index: "+map);

        Integer number1=1;
        Integer number2=2;
        Integer number3=3;
        String page1="connecting";
        String page2="possitive things";
        String page3="ecologic economy";



        map.put(number1,page1);
        map.put(number2,page2);
        map.put(number3,page3);
        System.out.println("Index and Value: "+map);

        System.out.println("Index Keys: "+map.keySet());

        System.out.println("Index Value: "+map.values());


        String changePage="teaching methods";

        map.put(number1,changePage);
        System.out.println("Index and Value: "+map);

        System.out.println("finding key is "+map.containsKey(1));





    }


}

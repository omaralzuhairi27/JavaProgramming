package week04.src.Exercise7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvancedIndexApplication {
    public static void main(String[] args) {
        Map <Integer, List <Topic>> map = new HashMap <>();
        System.out.println("Index: " + map);
        Integer fristNumber = 1;
        Integer secondNumber = 2;
        Topic text1 = new Topic("connecting");
        Topic text2 = new Topic("possitive things");
        Topic text3 = new Topic("ecologic economy");
        List <Topic> topic1 = new ArrayList <>();
        List <Topic> topic2 = new ArrayList <>();
        topic1.add(text1);
        topic2.add(text2);
        topic2.add(text3);
        map.put(fristNumber, topic1);
        map.put(secondNumber, topic2);
        System.out.println("Index: " +map);
        System.out.println("Index: " +map.keySet());
        System.out.println("Index: " +map.values());

        System.out.println("Index Entery Set"+map.entrySet());

        Topic topic=new Topic("possitive things");
        List<Topic> stored=new ArrayList <>(topic1);
        stored.add(topic);
        System.out.println("Index: "+map);

        if(map.containsKey(1)){
            System.out.println("the page number 1 is existed");
        }
    }
}

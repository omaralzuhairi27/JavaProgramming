package week11.Exercise3;

import java.util.HashMap;
import java.util.Map;

public class ChangeHoursToWords {
    public  String getIntegerStringMap(Integer number) {
        Map<Integer, String> numberMap = new HashMap<>();
        numberMap.put(0, "Zero");
        numberMap.put(1, "One");
        numberMap.put(2, "Two");
        numberMap.put(3, "Three");
        numberMap.put(4, "Four");
        numberMap.put(5, "Five");
        numberMap.put(6, "Six");
        numberMap.put(7, "Seven");
        numberMap.put(8, "Eight");
        numberMap.put(9, "Nine");
        numberMap.put(10, "Ten");
        numberMap.put(11, "Eleven");
        numberMap.put(12, "Twelve");
        numberMap.put(13, "Thirteen");
        numberMap.put(14, "Fourteen");
        numberMap.put(15, "Fifteen");
        numberMap.put(16, "Sixteen");
        numberMap.put(17, "Seventeen");
        numberMap.put(18, "Eighteen");
        numberMap.put(19, "Nineteen");
        numberMap.put(20, "Twenty");
        numberMap.put(21, "TwentyOne");
        numberMap.put(22, "TwentyTwo");
        numberMap.put(23, "TwentyThree");
        numberMap.put(24, "TwentyFour");
        numberMap.put(25, "TwentyFive");
        numberMap.put(26, "TwentySix");
        numberMap.put(27, "TwentySeven");
        numberMap.put(28, "TwentyEight");
        numberMap.put(29, "TwentyNine");
        numberMap.put(30, "Therty");
        return numberMap.get(number);
    }


}

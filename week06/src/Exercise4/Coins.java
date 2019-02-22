package week06.src.Exercise4;

import java.util.Arrays;
import java.util.List;

public class Coins {

    public static List<Money> asList(){
        List<Money> coins= Arrays.asList(
                new Cent50(),
                new Cent20(),
                new Cent10(),
                new Cent5(),
                new Cent2(),
                new Cent1());
        return coins;
    }


}

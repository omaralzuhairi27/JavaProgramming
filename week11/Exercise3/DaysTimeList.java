package week11.Exercise3;

import java.util.Arrays;
import java.util.List;

public class DaysTimeList {
    public static List<DaysTime> asList(){
        return Arrays.asList(
                new Morning(),
                new Noon(),
                new Afternoon(),
                new Evening(),
                new Night(),
                new Midnight()
                );
    }
}

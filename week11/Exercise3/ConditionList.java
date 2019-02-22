package week11.Exercise3;

import java.util.Arrays;
import java.util.List;

public class ConditionList {
    public static List<CheckListClock> aslist(){
        return Arrays.asList(
                new MinutePast(),
                new MinutesZero(),
                new MinuteTo()
        );
    }

}

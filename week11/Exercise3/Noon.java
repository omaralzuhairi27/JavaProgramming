package week11.Exercise3;

import java.time.LocalTime;

public class Noon implements DaysTime {
    @Override
    public Boolean checkDayTime(LocalTime time) {

        return time.equals(LocalTime.of(12,00));
    }

    @Override
    public String mesg() {
        return "noon";
    }
}

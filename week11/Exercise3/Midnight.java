package week11.Exercise3;

import java.time.LocalTime;

public class Midnight implements DaysTime {
    @Override
    public Boolean checkDayTime(LocalTime time) {

        return time.equals(LocalTime.of(00,00));
    }

    @Override
    public String mesg() {
        return "Midnight";
    }
}

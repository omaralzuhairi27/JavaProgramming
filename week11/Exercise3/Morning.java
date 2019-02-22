package week11.Exercise3;

import java.time.LocalTime;

public class Morning implements DaysTime {
    @Override
    public Boolean checkDayTime(LocalTime time) {

        return time.isAfter(LocalTime.of(6,00))&&time.isBefore(LocalTime.of(11,59));
    }

    @Override
    public String mesg() {
        return "Morning";
    }
}

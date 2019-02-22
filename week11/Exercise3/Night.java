package week11.Exercise3;

import java.time.LocalTime;

public class Night implements DaysTime {
    @Override
    public Boolean checkDayTime(LocalTime time) {

        return time.isAfter(LocalTime.of(20,01))&&time.isBefore(LocalTime.of(5,59));
    }

    @Override
    public String mesg() {
        return "Night";
    }
}

package week11.Exercise3;

import java.time.LocalTime;

public class Evening implements DaysTime {
    @Override
    public Boolean checkDayTime(LocalTime time) {

        return time.isAfter(LocalTime.of(17,01))&&time.isBefore(LocalTime.of(20,00));
    }

    @Override
    public String mesg() {
        return "Evening";
    }
}

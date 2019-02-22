package week11.Exercise3;

import java.time.LocalTime;

public class Afternoon implements DaysTime {
    @Override
    public Boolean checkDayTime(LocalTime time) {

        return time.isAfter(LocalTime.of(12,01))&&time.isBefore(LocalTime.of(17,00))&&time.equals(LocalTime.of(17,00));
    }

    @Override
    public String mesg() {
        return "Afternoon";
    }
}

package week11.Exercise2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/* Name of the class has to be "Main" only if the class is public. */
class ChangeHour {

    public static void main(String[] args) {
        ChangeHour hour = new ChangeHour();
        System.out.println("Output: " + hour.toMilitaryTime("07:05:45PM"));

    }

    String toMilitaryTime(String time) {
        DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("hh:mm:ssa");
        LocalTime localTime = LocalTime.parse(time, formatterInput);

        DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("HH:mm:ss");

        return localTime.format(formatterOutput);

    }




}
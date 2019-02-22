package week11.ReflictionSulotion;

import week11.ReflictionSulotion.solstice.Solstice;
import week11.ReflictionSulotion.solstice.SummerSolstice;
import week11.ReflictionSulotion.solstice.WinterSolstice;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Solstices {

    private Solstice summerSolstice = new SummerSolstice();
    private Solstice winterSolstice = new WinterSolstice();

    public String getSummerSolsticeCountdown(LocalDate current) {
        LocalDate solstice = summerSolstice.getNext(current);
        return getMessage(current, solstice, "Summer Solstice");
    }

    private String getMessage(LocalDate current, LocalDate solstice, String kind) {
        return "The " + kind + " " +
                solstice.getYear() + " is on " +
                solstice.getDayOfWeek() + ", " +
                solstice.getMonth() + " " +
                solstice.getDayOfMonth() + ", " +
                solstice.getYear() + " (in " +
                ChronoUnit.DAYS.between(current, solstice) + " days).";
    }

    public String getWinterSolsticeCountdown(LocalDate current) {
        LocalDate solstice = winterSolstice.getNext(current);
        return getMessage(current, solstice, "Winter Solstice");
    }

}

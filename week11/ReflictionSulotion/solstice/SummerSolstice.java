package week11.ReflictionSulotion.solstice;

import java.time.LocalDate;
import java.time.Month;

public class SummerSolstice extends Solstice {

    public SummerSolstice() {
        super(Month.JUNE);
    }

    protected LocalDate applyException(LocalDate solstice) {
        if (solstice.isLeapYear()) {
            return solstice.minusDays(1);
        }
        return solstice;
    }

}

package week11.ReflictionSulotion.solstice;

import java.time.LocalDate;
import java.time.Month;

public class WinterSolstice extends Solstice {

    public WinterSolstice() {
        super(Month.DECEMBER);
    }

    protected LocalDate applyException(LocalDate solstice) {
        if (solstice.plusYears(1).isLeapYear()) {
            return solstice.plusDays(1);
        }
        return solstice;
    }

}

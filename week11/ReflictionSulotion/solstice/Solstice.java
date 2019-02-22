package week11.ReflictionSulotion.solstice;

import java.time.LocalDate;
import java.time.Month;

public abstract class Solstice {

    private int day = 21;
    private Month month;

    public Solstice(Month month) {
        this.month = month;
    }

    public LocalDate getNext(LocalDate current) {
        LocalDate solstice = getSolstice(current);
        if (current.isAfter(solstice)) {
            return getSolstice(current.plusYears(1));
        }
        return solstice;
    }

    private LocalDate getSolstice(LocalDate current) {
        LocalDate guess = LocalDate.of(current.getYear(), month.getValue(), day);
        return applyException(guess);
    }

    protected abstract LocalDate applyException(LocalDate guess);

}

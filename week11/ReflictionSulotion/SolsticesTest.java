package week11.ReflictionSulotion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class SolsticesTest {

    private Solstices solstices = new Solstices();

    @Test
    void getSummerSolsticeCountdown() {
        LocalDate current = LocalDate.parse("2019-02-01");
        String result = solstices.getSummerSolsticeCountdown(current);

        String expected = "The Summer Solstice 2019 is on FRIDAY, JUNE 21, 2019 (in 140 days).";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void getWinterSolsticeCountdown() {
        LocalDate current = LocalDate.parse("2019-02-01");
        String result = solstices.getWinterSolsticeCountdown(current);

        String expected = "The Winter Solstice 2019 is on SUNDAY, DECEMBER 22, 2019 (in 324 days).";

        Assertions.assertEquals(expected, result);
    }
}
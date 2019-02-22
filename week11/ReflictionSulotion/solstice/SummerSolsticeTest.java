package week11.ReflictionSulotion.solstice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

class SummerSolsticeTest {
    
    private SummerSolstice solstice = new SummerSolstice();

    @Test
    void getNext() {
        Map<LocalDate, LocalDate> values = getValues();
        
        values.entrySet().stream()
                .forEach(e-> Assertions.assertEquals(e.getValue(), solstice.getNext(e.getKey())));
    }

    private Map<LocalDate, LocalDate> getValues() {
        Map<LocalDate, LocalDate> values = new HashMap<>();
        values.put(LocalDate.parse("2019-02-01"),LocalDate.parse("2019-06-21"));
        values.put(LocalDate.parse("2019-10-01"),LocalDate.parse("2020-06-20"));
        values.put(LocalDate.parse("2022-02-01"),LocalDate.parse("2022-06-21"));
        values.put(LocalDate.parse("2023-02-01"),LocalDate.parse("2023-06-21"));
        values.put(LocalDate.parse("2020-06-20"),LocalDate.parse("2020-06-20"));
        return values;
    }
}
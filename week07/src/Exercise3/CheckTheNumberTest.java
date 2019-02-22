package week07.src.Exercise3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheckTheNumberTest {
    CheckTheNumber checkTheNumber=new CheckTheNumber();

    @Test
    void checkBigestNumber() {
        List< Integer> numbers= Arrays.asList(1,2,4,2,4,6,1,5,8,9);
        Integer  number=1234249898;
        Integer expected=9;
        assertEquals(expected,checkTheNumber.checkBigestNumber(number));
    }
}
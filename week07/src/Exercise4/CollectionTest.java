package week07.src.Exercise4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static week07.src.Exercise4.Collection.changeIntToList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionTest {

    @Test
    void testChangeIntToList() {
        Integer number = 3245;
        List <String> result = changeIntToList(number);
        List <String> expected = Arrays.asList("3", "2", "4", "5");
        assertEquals(expected, result);
    }
}
package week06.src.Exercise3;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMakersTest {

    @Test
    void asList() {
        List<CoffeeMaker> coffeeMakerList=CoffeeMakers.asList();


        Optional<CoffeeMaker> coffeeMaker1=CoffeeMakers.get("French press");
        assertEquals("French press",coffeeMaker1.get().getName());
    }

    @Test
    void get() {
    }
}
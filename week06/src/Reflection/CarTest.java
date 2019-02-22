package week06.src.Reflection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {



    @Test
    void drive() {
        List<Car> type=new ArrayList<>();
        type.add(new AutomaticCar("Audi"));
        type.add(new ManualCar("Audi"));
        Random random=new Random();
        Car newAutomaticCar=type.get(random.nextInt(1));
        Car newManualCar =type.get(random.nextInt(2)*1);
        assertEquals("Manual",newManualCar.drive());
        assertEquals("Automatic",newAutomaticCar.drive());
    }
}
package week06.src.Reflection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cars {

    public Car getNextCar(String brand){
        List<Car> type=new ArrayList <>();
        type.add(new AutomaticCar(brand));
        type.add(new ManualCar(brand));
        Random random=new Random();

        Car newCar=type.get(random.nextInt(2));
        return newCar;
    }
}

package week06.src.Exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {

    public static List<CoffeeMaker> asList(){
        List<CoffeeMaker> coffees= Arrays.asList(
                new AutoDrip(),
                new FrenchPress(),
                new AutomaticCoffeeMachine());
        return coffees;
    }


    public static Optional<CoffeeMaker> get(String name){
        for (CoffeeMaker coffeeMaker : asList() ) {
            if (coffeeMaker.getName().equalsIgnoreCase(name)){
                return Optional.of(coffeeMaker);

            }

        }
        return Optional.empty();

    }

}

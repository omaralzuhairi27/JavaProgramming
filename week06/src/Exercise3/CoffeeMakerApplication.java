package week06.src.Exercise3;

import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {
    public static void main(String[] args) {
       List<CoffeeMaker> coffeeMakerList= CoffeeMakers.asList();
        for (CoffeeMaker coffeeMaker : coffeeMakerList) {
            System.out.println(coffeeMaker.brew().getMadeBy()+" brewed a coffee and it took "+coffeeMaker.brew().getBrewedTime()+" minutes");
        }


        for (CoffeeMaker coffeeMaker : coffeeMakerList) {
            if(Optional.of(coffeeMaker).isPresent()){
                coffeeMaker.brew();
                System.out.println(coffeeMaker.brew().getMadeBy()+" brewed a coffee and it took "+coffeeMaker.brew().getBrewedTime()+" minutes");
            }else{
                System.out.println("The coffee maker with the name "+ coffeeMaker.getName() +" pot is not available");
            }
        }



        Optional <CoffeeMaker> coffeeMaker1 = CoffeeMakers.get("French press");
        if(coffeeMaker1.isPresent()){
            coffeeMaker1.get().brew();
            System.out.println(coffeeMaker1.get().brew().getMadeBy()+" brewed a coffee and it took "+coffeeMaker1.get().brew().getBrewedTime()+" minutes");


        }else{
            Optional.empty();
        }
        Optional <CoffeeMaker> coffeeMaker2 = CoffeeMakers.get("Auto drip");
        if(coffeeMaker2.isPresent()){
            System.out.println(coffeeMaker2.get().brew().getMadeBy()+" brewed a coffee and it took "+coffeeMaker2.get().brew().getBrewedTime()+" minutes");
        }else{
            Optional.empty();
        }
        Optional <CoffeeMaker> coffeeMaker3 = CoffeeMakers.get("Automatic coffee machine");
        if(coffeeMaker3.isPresent()){
            System.out.println(coffeeMaker3.get().brew().getMadeBy()+" brewed a coffee and it took "+coffeeMaker3.get().brew().getBrewedTime()+" minutes");
        }else{
            Optional.empty();
        }
        String name="moke";
        Optional <CoffeeMaker> coffeeMaker4 = CoffeeMakers.get(name);
        if(coffeeMaker4.isPresent()){
            System.out.println(coffeeMaker4.get().brew().getMadeBy()+" brewed a coffee and it took "+coffeeMaker4.get().brew().getBrewedTime()+" minutes");
        }
        else{
            System.out.println("The coffee maker with the name "+ name+" pot is not available");
        }

    }


}

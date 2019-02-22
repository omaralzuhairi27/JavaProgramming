package week06.src.Exercise3;

public abstract class CoffeeMaker {
    public abstract String getName();
    public abstract Integer getBrewingTime();

    public  Coffee brew(){
        return new Coffee(getName(),getBrewingTime());
    }

}

/*It has the getName abstract method that returns a String.
It has the getBrewingTime abstract method that returns an Integer.
It has the brew method that returns a Coffee. It uses the getName and getBrewingTime methods to create a Coffee and returns it.
*/
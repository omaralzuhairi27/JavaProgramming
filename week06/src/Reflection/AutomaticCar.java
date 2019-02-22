package week06.src.Reflection;

public class AutomaticCar extends Car {

    public AutomaticCar(String brand) {
        super(brand);
    }

    @Override
    public String drive() {
        return "Automatic";
    }
}

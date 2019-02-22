package week06.src.Reflection;

public class ManualCar extends Car{
    public ManualCar(String brand) {
        super(brand);
    }

    @Override
    public String drive() {
        return "Manual";
    }
}

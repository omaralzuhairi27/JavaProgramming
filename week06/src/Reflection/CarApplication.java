package week06.src.Reflection;

public class CarApplication {
    public static void main(String[] args) {
        Hansel hansel=new Hansel();
        Cars cars=new Cars();
        Car audi=cars.getNextCar("Audi");
        Car mercedes=cars.getNextCar("Mercedes");
        Car seat=cars.getNextCar("Seat");
        Car skoda=cars.getNextCar("Skoda");
        Car tesla=cars.getNextCar("Tesla");
        Car bmw=cars.getNextCar("Bmw");
        Car peugeot=cars.getNextCar("Peugeot");
        Car citroen=cars.getNextCar("Citroen");
        Car jeep=cars.getNextCar("Jeep");
        Car ferrari=cars.getNextCar("Ferrari");

        hansel.haveATry(audi);
        hansel.haveATry(mercedes);
        hansel.haveATry(seat);
        hansel.haveATry(skoda);
        hansel.haveATry(tesla);
        hansel.haveATry(bmw);
        hansel.haveATry(peugeot);
        hansel.haveATry(citroen);
        hansel.haveATry(jeep);
        hansel.haveATry(ferrari);

    }
}

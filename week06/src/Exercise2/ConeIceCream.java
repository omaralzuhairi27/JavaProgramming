package week06.src.Exercise2;

public class ConeIceCream extends IceCream {
    public ConeIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat() {
        return "The "+getTopping()+" ice-cream with" + getFlavor() +" is licked";
    }
}

package week06.src.Exercise2;

public class IceCreamApplication {
    public static void main(String[] args) {
        ConeIceCream coneIceCream=new ConeIceCream("Chocolate","Oreo");
        System.out.println(coneIceCream.eat());
        CupIceCream cupIceCream=new CupIceCream("Vanilla","Cookies");
        System.out.println(cupIceCream.eat());

    }

}

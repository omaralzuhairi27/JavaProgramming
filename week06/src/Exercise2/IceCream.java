package week06.src.Exercise2;

public abstract class IceCream {
    private String flavor;
    private String topping;

    public IceCream(String flavor, String topping) {
        this.flavor = flavor;
        this.topping = topping;
    }

    protected String getFlavor() {
        return flavor;
    }

    protected String getTopping() {
        return topping;
    }
    abstract public String eat( );
}

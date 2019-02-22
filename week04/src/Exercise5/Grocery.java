package week04.src.Exercise5;

public class Grocery {

    private String name;

    public Grocery(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" +"name='" + name + '\'';
    }



    public String getName() {
        return name;
    }
}

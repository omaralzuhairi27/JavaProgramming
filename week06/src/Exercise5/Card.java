package week06.src.Exercise5;

public class Card {
    private String name;
    private Long digitNumber;

    public Card(String name, Long digitNumber) {
        this.name = name;
        this.digitNumber = digitNumber;
    }

    public String getName() {
        return name;
    }

    public  Long getDigitNumber() {
        return digitNumber;
    }
}

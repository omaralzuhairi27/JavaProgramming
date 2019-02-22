package week06.src.Exercise5;

public abstract class CreditCard {
public abstract String getName();
public abstract Long getDigitNumber();
public abstract Boolean isValid(Long number);
public Card create(){
    return new Card(getName(),getDigitNumber());
}

}

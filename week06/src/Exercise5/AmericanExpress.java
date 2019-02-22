package week06.src.Exercise5;

public class AmericanExpress extends CreditCard {
    @Override
    public String getName() {
        return "American Express";
    }

    @Override
    public Long getDigitNumber() {
        return 378282246310005l;
    }

    @Override
    public Boolean isValid(Long number) {
        String digitLength=Long.toString(number);
        if(digitLength.length()==15&&digitLength.startsWith("37")||digitLength.startsWith("34")){
            return true;
        }
        return false;

    }
}

package week06.src.Exercise5;

public class VisaCard extends CreditCard {
    @Override
    public String getName() {
        return "Visa Card";
    }

    @Override
    public Long getDigitNumber() {

        return 4000123456789010l;
    }

    @Override
    public Boolean isValid(Long number) {
        String digitLength=Long.toString(number);
        if(digitLength.length()==16||digitLength.length()==13&&digitLength.startsWith("4")){
            return true;
        }
        return false;
    }
}

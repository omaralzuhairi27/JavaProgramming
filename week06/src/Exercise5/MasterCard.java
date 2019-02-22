package week06.src.Exercise5;

public class MasterCard extends CreditCard {
    @Override
    public String getName() {
        return "Master Card";
    }

    @Override
    public Long getDigitNumber() {
        return 5212345678912345l ;
    }

    @Override
    public Boolean isValid(Long number) {

        String digitLength=Long.toString(number);
        if(digitLength.length()==16&&digitLength.startsWith("51")||digitLength.startsWith("52")||digitLength.startsWith("53")||digitLength.startsWith("54")||digitLength.startsWith("55")){
            return true;
        }
        return false;
    }


    }


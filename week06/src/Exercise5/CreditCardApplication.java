package week06.src.Exercise5;

import java.util.List;

public class CreditCardApplication {
    public static void main(String[] args) {

        List<CreditCard> creditCardList= Cards.asList();
        for (CreditCard creditCard : creditCardList) {
            Long number=creditCard.getDigitNumber();
            if((LuhnAlgorithm.validateCardNumber(number)&& creditCard.isValid(number))){
                System.out.println(creditCard.getName()+" valid");
            }else{
                System.out.println(creditCard.getName()+" invalid");
            }
        }


    }
}

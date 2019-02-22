package week06.src.Exercise5;

import java.util.Arrays;
import java.util.List;

public class Cards {
   public static List<CreditCard> asList(){
       List<CreditCard> creditCards= Arrays.asList(
               new MasterCard(),
               new VisaCard(),
               new AmericanExpress());
       return creditCards;
   }
}

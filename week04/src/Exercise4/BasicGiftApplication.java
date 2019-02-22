package week04.src.Exercise4;

import java.util.Optional;

public class BasicGiftApplication {
    public static void main(String[] args) {

        Optional<String> optional = Optional.empty();
        System.out.println("Gift: "+optional);

        optional= Optional.of("Robotoy");
        System.out.println("Gift: "+optional);

         System.out.println("Gift: "+optional.isPresent());


             System.out.println("The gift is a "+optional.get());



    }
}

/*Christmas is coming and Derek’s new working colleges want to organize an “invisible friend” present giving in their
company.
Create the ​ BasicGiftApplication ​ class and write the following instructions in its ​ main ​ method:
● Create an empty ​ giftBox ​ Optional of String and display it.
● Assign an Optional of String to the ​ giftBox ​ containing an actual present and display it.
● Ask if the ​ giftBox ​ is present and display the answer.
● Get the value contained in ​ giftBox ​ and display it.
Gift: Optional.empty
Gift: Optional[Robotoy]
There is a present in the gift box
The gift is a Robotoy*/
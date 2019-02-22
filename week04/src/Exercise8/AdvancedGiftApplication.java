package week04.src.Exercise8;

import java.util.Optional;

public class AdvancedGiftApplication {
    public static void main(String[] args) {
        //Box giftBox = new Box();
        Optional<Box> giftBox= Optional.empty();
        System.out.println("Gift: "+giftBox);

        Box content=new Box("Robotoy");

        giftBox=Optional.of(content);
        System.out.println("Gift: "+giftBox);

        if(giftBox.isPresent()){
            System.out.println("There is a present in the gift box");
        }

        System.out.println("The gift is a "+giftBox.get());

    }
}

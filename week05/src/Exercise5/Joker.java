package week05.src.Exercise5;

import week05.src.Exercise4.SuperheroCaller;

public class Joker implements Villain {

    Integer lives = 10;

    @Override
    public void weaken(String name) {
        SuperheroCaller superheroCaller = new SuperheroCaller();

        for (int i = lives; i > 0; i--) {
            name = superheroCaller.call().getName();
            System.out.println("Damn you, " + name + " \t You managed to weaken me");
            if (i == 1) {
                System.out.println("\n You all defeated me! But I will be back!");
            }
        }

    }
}

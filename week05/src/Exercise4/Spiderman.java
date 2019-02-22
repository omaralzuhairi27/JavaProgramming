package week05.src.Exercise4;

import week05.src.Exercise5.Villain;

public class Spiderman implements Superhero {
    private String name="Spiderman";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken("villain");

    }

    @Override
    public String toString() {
        return name;

    }
}

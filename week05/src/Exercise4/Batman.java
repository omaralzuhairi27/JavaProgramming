package week05.src.Exercise4;

import week05.src.Exercise5.Villain;

public class Batman implements Superhero {
    private String name="Batman";
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

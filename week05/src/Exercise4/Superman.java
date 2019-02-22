package week05.src.Exercise4;

import week05.src.Exercise5.Villain;

public class Superman implements Superhero {
    private String name="Superman";
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

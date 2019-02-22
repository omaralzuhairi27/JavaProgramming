package week05.src.Exercise4;

import java.util.*;

public class SuperheroCaller {

    public Superhero call() {
        List <Superhero> superheroes = Arrays.asList(new Batman(), new Superman(), new Spiderman());
        Random random = new Random();
        Integer randomNumber = random.nextInt(3);
        return (superheroes.get(randomNumber));
    }
}

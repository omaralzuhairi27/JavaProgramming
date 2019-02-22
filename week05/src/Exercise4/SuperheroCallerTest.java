package week05.src.Exercise4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroCallerTest {

    @Test
    void call() {
        List<Superhero> superheroes = Arrays.asList(new Batman(), new Superman(), new Spiderman());
        Random random = new Random();
        Integer randomNumber = random.nextInt(3);


    }
}
package week05.src.Exercise4;

import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {
    public static void main(String[] args) {
        SuperheroCaller superheroCaller=new SuperheroCaller();
        System.out.println("Superhero: "+superheroCaller.call());
        List<Superhero> superhero=new ArrayList <>();
        for (int i = 1; i <=6 ; i++) {
            Superhero hero=superheroCaller.call();
            superhero.add(hero);
            System.out.println("Superhero"+ i + ": " +hero);
        }
        System.out.println("Number of superheroes: "+superhero.size());
    }
}

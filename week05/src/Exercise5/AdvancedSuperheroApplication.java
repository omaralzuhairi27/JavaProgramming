package week05.src.Exercise5;


import week05.src.Exercise4.SuperheroCaller;

public class AdvancedSuperheroApplication {
    public static void main(String[] args) {
        SuperheroCaller superheroCaller=new SuperheroCaller();
        Joker joker=new Joker();
       joker.weaken(superheroCaller.call().getName());

    }
}

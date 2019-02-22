package week02.src;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        System.out.println("woof food do i get today");
       Scanner  scanner= new Scanner(System.in);
       Integer food=scanner.nextInt();
       Integer jumpTime=6*food;
        Integer barkTime=1+food;

        System.out.println("Jumps "+jumpTime+" Times and barks "+barkTime+" times");




    }
}

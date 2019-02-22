package week03.src;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("Say a number between 1 and 10 ");
        Scanner scanner=new Scanner(System.in);
        Integer number=scanner.nextInt();
        while ((number<1) || (number>10)){
            System.out.println("Say a number between 1 and 10 ");
            number=scanner.nextInt();
        }
        System.out.println("Alright! Lets perform a trick with that number.");
    }
}

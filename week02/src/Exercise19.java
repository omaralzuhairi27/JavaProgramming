package week02.src;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
     System.out.println("Welcome to our comic shop. How much is your comic?");
        Double price=scanner.nextDouble();
     System.out.println("How much you going to pay?");
        Double moneyPaid=scanner.nextDouble();
        double rest=moneyPaid-price;

        Long euro=Math.round(rest);
        double cent=rest-euro;


        System.out.println("the price"+cent);

       // double sum=euro+price;
       // System.out.println(sum);


    }
}

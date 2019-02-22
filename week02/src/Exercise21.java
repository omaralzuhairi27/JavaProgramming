package week02.src;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        System.out.println("What is the last episode number you watched?");
        Scanner scanner = new Scanner(System.in);
        Integer episode=scanner.nextInt();
        if(episode<=12){
            Integer season1=episode*47;
            System.out.println("the season 1 is ");
        }else
            episode=episode-12;
            Integer season1Eposode=12*47;
            episode=episode*34;
        System.out.println("the season 1 is "+season1Eposode+"the season 2 is "+episode);
    }
}

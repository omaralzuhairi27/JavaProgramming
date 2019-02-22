package week02.src.Exercise4;

import java.util.List;
import java.util.Scanner;

public class Customer {
    public void askForAPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much is ");
        String name=scanner.nextLine();
        Menu menu=new Menu();
        List<Meals> mealsList= menu.mealsList();
        Double price=0.0;
        for(Meals meals:mealsList){
            if(meals.getMealName().equals(name)){
                 price= meals.getMealPrice();
                 System.out.println(price);
                 return;
            }

        }
        System.out.println(price);

    }




}

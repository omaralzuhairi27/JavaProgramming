package week02.src.Exercise4;

import java.util.List;

public class Waiter {
    public void showTheMenu(){
        Menu menu=new Menu();
       List<Meals> meals= menu.mealsList();
        System.out.println("The Menu");
       for(Meals meals1:meals){
           System.out.println(meals1.getMealName());
       }
    }
    public void mealPrice(Meals name){
        Menu menu=new Menu();
        List<Meals> meals= menu.mealsList();
        for(Meals meals1:meals){
            if(name==meals1){
                System.out.println("the "+name+" Preice is "+name.getMealPrice());
            }
        }
    }


}

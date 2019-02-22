package week04.src.Exercise5;

import java.util.ArrayList;
import java.util.List;

public class AdvancedShoppingApplication {
    public static void main(String[] args) {

        List<Grocery> groceryList=new ArrayList <>();
        System.out.println("Groceries: "+groceryList);
        Grocery grocery1=new Grocery("bananas");
        Grocery grocery2=new Grocery("oranges");
        Grocery grocery3=new Grocery("tomatoes");
        groceryList.add(grocery1);
        groceryList.add(grocery2);
        groceryList.add(grocery3);


        System.out.println("Groceries: "+ groceryList);

        Grocery grocery=new Grocery("tomatoes");
            groceryList.remove(grocery);
        System.out.println("Groceries: "+ groceryList);

        Grocery grocery4=new Grocery("oranges");
        Grocery grocery5=new Grocery("tomatoes");
        groceryList.add(grocery4);
        groceryList.add(grocery5);
        System.out.println("Groceries: "+ groceryList);

        //groceryList.remove(grocery);
        System.out.println("Groceries: "+ groceryList);

        System.out.println("Groceries Size: "+groceryList.size());


    }
}

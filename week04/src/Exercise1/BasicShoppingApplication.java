package week04.src.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class BasicShoppingApplication {
    public static void main(String[] args) {
        List<String> groceries=new ArrayList <>();
            System.out.println("Groceries: "+groceries);

        groceries.add(new Fruits("bananas").getName());
        groceries.add(new Fruits("oranges").getName());
        groceries.add(new Fruits("tomatoes").getName());
            System.out.println("Groceries: "+groceries);


        groceries.remove("bananas");
            System.out.println("Groceries: "+groceries);

        groceries.add(new Fruits("tomatoes").getName());
        groceries.add(new Fruits("tomatoes").getName());
            System.out.println("Groceries: "+groceries);

        groceries.remove(2);
        System.out.println("Groceries: "+groceries);

        System.out.println("Groceries Size: "+groceries.size());


    }
}


/*Create the ​ BasicShoppingApplication ​ class and write the following instructions in its ​ main ​ method:
● Create an empty ​ groceries ​ list and display it.
● Create three Strings that represent three different groceries.
● Add them to the ​ groceries ​ list and display it.
● Remove one of them by providing its name as an argument and display the list.
● Add one of the existing groceries twice and display the list.
● Remove the third element of the list by providing its position and display it.
● Display its size.



*/
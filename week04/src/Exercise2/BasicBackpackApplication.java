package week04.src.Exercise2;

import java.util.HashSet;

public class BasicBackpackApplication {
    public static void main(String[] args) {
        HashSet<String> backpack=new HashSet <>();
        System.out.println("Backpack: "+backpack);

        backpack.add(new Items("toothpaste").getName());
        backpack.add(new Items("towel").getName());
        backpack.add(new Items("underwear").getName());
        System.out.println("Backpack: "+backpack);



        System.out.println("The item is "+backpack.contains("towel"));



        backpack.remove("underwear");
        System.out.println("Backpack: "+backpack);


    if(!backpack.contains("underwear")){
        System.out.println("The backpack no longer contains underwear");
    }

    backpack.add("towel");
    backpack.add("towel");

        System.out.println("Backpack: "+backpack);


        System.out.println("Backpack Size " +backpack.size());



    }
}
/*
Hansel is preparing himself for a trip and wants to make sure he has packed at least one of everything.
Create the ​ BasicBackpackApplication ​ class and write the following instructions in its ​ main ​ method:
● Create an empty ​ backpack ​ set and display it.
● Create three Strings that represent three different items.
● Add them to the ​ backpack ​ set and display it.
● Ask if one of them is contained in the set and display the answer.
● Remove one of them by providing its name as an argument and display the set.
● Ask if the element you just removed is not contained in the set and display the answer.
● Add one of the existing items twice and display the set.
● Display its size.
*/
package week04.src.Exercise6;

import java.util.HashSet;

public class AdvancedBackpackApplication {
    public static void main(String[] args) {
        HashSet<Item> backpack=new HashSet <>();
        System.out.println("Backpack: "+backpack);

        Item item1=new Item("toothpaste");
        Item item2=new Item("towel");
        Item item3=new Item("underwear");
        backpack.add(item1);
        backpack.add(item2);
        backpack.add(item3);
        System.out.println("Backpack: "+backpack);

        Item item=new Item("underwear");

        backpack.remove(item);
        System.out.println("Backpack: "+backpack);
        if(!backpack.contains("underwear")){
            System.out.println("The backpack no longer contains underwear");
        }


        Item item4=new Item("toothpaste");
        Item item5=new Item("towel");
        backpack.add(item4);
        backpack.add(item5);
        System.out.println("Backpack: "+backpack);

        System.out.println("Backpack Size:" +backpack.size());

    }
}

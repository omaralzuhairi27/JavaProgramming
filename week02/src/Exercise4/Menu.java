package week02.src.Exercise4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public Menu() {
    }

    public List<Meals>  mealsList(){
        List<Meals> meals=new ArrayList<>();
        meals.add(new Meals("couscous",8.5));
        meals.add(new Meals("tajin",9.5));
        meals.add(new Meals("hummus",3.5));
        meals.add(new Meals("falafel",4.0));
        return meals;
    }



}

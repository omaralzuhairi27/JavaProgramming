package week02.src.Exercise4;

import java.util.List;

public class Order {
    public void Order(List<Meals> mealsOrder){
        for(Meals meals: mealsOrder){
            meals.getMealPrice();
        }

        }
}

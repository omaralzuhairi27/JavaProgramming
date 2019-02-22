package week02.src.Exercise4;

public class Meals {
    private String mealName;
    public double mealPrice;

    public Meals(String mealName, double mealPrice) {
        this.mealName = mealName;
        this.mealPrice = mealPrice;
    }

    public String getMealName() {
        return mealName;
    }

    public double getMealPrice() {
        return mealPrice;
    }
}

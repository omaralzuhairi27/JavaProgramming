package week06.src.kid;

public abstract class Kid {

    private String favouriteFood;

    public Kid(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }


    public void annoy() {
        System.out.println(getSentence() + " I want to eat " + favouriteFood);
    }

    protected abstract String getSentence();
}

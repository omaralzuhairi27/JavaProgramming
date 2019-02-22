package week06.src.Exercise4;

public abstract class Money {


    public abstract Integer getAmount();

    public Coin amount(){
        return new Coin(getAmount());
    }


}

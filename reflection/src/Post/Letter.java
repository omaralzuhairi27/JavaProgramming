package reflection.src.Post;

public class Letter {

    public void setLetter(String letter) {
        this.letter = letter;
    }

    private String letter;
    private String address;
    Boolean stamped=false;

    public String getLetter() {
        return letter;
    }
    public String getAddress() {
        return address;
    }
    public Boolean isStamped(Letter letter){
        return letter.stamped;


    }
    public Boolean stamp(){
        return  stamped=true;
    }

}

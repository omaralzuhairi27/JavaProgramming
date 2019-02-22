package week02.src;

public class Letter {
    private String address;
    Boolean stamped=false;

    public String getAddress() {
        return address;
    }
    public Boolean isStamped(Letter letter){
        return letter.equals("staped");

    }
    public Boolean stamp(){
        return  stamped=true;
    }

}

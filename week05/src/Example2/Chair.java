package week05.src.Example2;

public class Chair {
    private Integer legs=0;
    private Boolean seat=false;
    public boolean isFinished(){
        return legs==4&&seat;
    }

    public Integer getLegs() {
        return legs;
    }

    public Boolean getSeat() {
        return seat;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public void setSeat(Boolean seat) {
        this.seat = seat;
    }
}

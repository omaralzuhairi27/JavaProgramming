package week06.src.animal;

import week06.src.Exercise1.BigHotAirBalloon;
import week06.src.Exercise1.HotAirBalloon;
import week06.src.Exercise1.SmallHotAirBalloon;

public class HotAirBalloonApplication {
    public static void main(String[] args) {
        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        System.out.println("smallBalloon --");
        smallBalloon.liftIp();
        smallBalloon.land();
        BigHotAirBalloon bigBalloon=new BigHotAirBalloon();
        System.out.println("bigBalloon --");
        bigBalloon.liftIp();
        bigBalloon.land();
        HotAirBalloon small=smallBalloon;
        HotAirBalloon big=bigBalloon;
        System.out.println("small");
        small.land();
        small.liftIp();
        System.out.println("big");
        big.liftIp();
        big.land();

    }
}

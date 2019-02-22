package week02.src.Exercise3;

import java.util.List;

public class Hansel {
    private Integer footSize=41;

    private Boolean isRightSize(HikingBoot hikingBoot) {
        // hikingBoot=41;
        if (hikingBoot.getSize()== footSize) {
            return true;
        }
        return false;
    }
    public void tryHikingBoots(List<HikingBoot> boots){
        for(HikingBoot boot : boots){
            if(isRightSize(boot)){
                System.out.println("I am buying this");
                return;
            }
            else{
                System.out.println("dose not fit");

            }
        }
    }
}

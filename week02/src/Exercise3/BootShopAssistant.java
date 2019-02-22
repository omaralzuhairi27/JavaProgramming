package week02.src.Exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BootShopAssistant {


    public List<HikingBoot> getHikingBootRecommendations(){
        List<HikingBoot> sizeList=new ArrayList<>();
       // HikingBoot size1=new HikingBoot();
        //size.getSize();

        sizeList.add(new HikingBoot(41));
        sizeList.add(new HikingBoot(42));
        sizeList.add(new HikingBoot(43));
        Collections.shuffle(sizeList);
        return sizeList;
    }


}

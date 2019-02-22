package week02.src.Exercise3;

import java.util.List;

public class BootShopApplicatin {
    public static void main(String[] args) {
        BootShopAssistant bootShopAssistant=new BootShopAssistant();
        List<HikingBoot> testBoot=bootShopAssistant.getHikingBootRecommendations();
        Hansel hansel=new Hansel();
        hansel.tryHikingBoots(testBoot);
    }
}

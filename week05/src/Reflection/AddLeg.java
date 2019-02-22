package week05.src.Reflection;

import week05.src.Exercise6.Furniture;
import week05.src.Exercise6.Step;

public class AddLeg implements Step {
    @Override
    public TvTable perform(Furniture furniture) {
        TvTable addpart = furniture.add("Lege");
        return addpart;
    }
}

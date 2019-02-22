package week05.src.Exercise6;

import week05.src.Reflection.TvTable;

public class AddSide implements Step {
    @Override
    public TvTable perform(Furniture furniture) {
        TvTable addpart=furniture.add("Side");
        return addpart;
    }
}

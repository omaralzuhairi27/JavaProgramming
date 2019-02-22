package week05.src.Exercise6;

import week05.src.Reflection.TvTable;

public class AddBack implements Step {
    @Override
    public TvTable perform(Furniture furniture) {
        TvTable addpart=furniture.add("Back");
        return addpart;
    }
}

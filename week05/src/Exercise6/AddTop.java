package week05.src.Exercise6;

import week05.src.Reflection.TvTable;

public class AddTop implements Step{
    @Override
    public String toString() {
        return "Top";
    }

    @Override
    public TvTable perform(Furniture furniture) {
        TvTable addpart=furniture.add("Top");
        return addpart;
    }

}

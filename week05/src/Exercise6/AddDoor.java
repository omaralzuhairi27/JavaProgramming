package week05.src.Exercise6;

import week05.src.Reflection.TvTable;

public class AddDoor implements Step {
    @Override
    public TvTable perform(Furniture furniture) {
        TvTable addpart=furniture.add("Door");
        return addpart;
    }
}

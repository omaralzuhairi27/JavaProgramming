package week05.src.Exercise6;

import java.util.Arrays;
import java.util.List;

public class WardrobeBuilder {
    //one bottom, two sides, one back, one
    //top, eight shelves and two doors
    List<Step> steps= Arrays.asList(new AddBottom(),new AddSide(),new AddSide(),new AddBack(),new AddTop(),
            new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),
            new AddShelf(),new AddShelf(),new AddDoor(),new AddDoor());

    public Wardrobe build(){
        Wardrobe wardrobe=new Wardrobe();
        for (Step step:steps) {
            step.perform(wardrobe);

        }
        return wardrobe;
    }
}

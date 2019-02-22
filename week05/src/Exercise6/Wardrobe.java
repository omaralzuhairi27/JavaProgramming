package week05.src.Exercise6;

import week05.src.Reflection.TvTable;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe implements Furniture {
    List<String> parts=new ArrayList <>();
    @Override
    public TvTable add(String part) {
    parts.add(part);
        return null;
    }


}

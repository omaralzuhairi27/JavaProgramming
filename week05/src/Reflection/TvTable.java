package week05.src.Reflection;

import week05.src.Exercise6.Furniture;

import java.util.ArrayList;
import java.util.List;

public class TvTable implements Furniture {
    List <String> parts = new ArrayList <>();

    @Override
    public TvTable add(String part) {
        parts.add(part);

        return null;
    }
}

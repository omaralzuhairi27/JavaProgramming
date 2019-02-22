package week05.src.Reflection;


import week05.src.Exercise6.AddShelf;
import week05.src.Exercise6.AddTop;
import week05.src.Exercise6.Step;

import java.util.Arrays;
import java.util.List;

public class TvTableBuilder {

    // four legs, one shelf and one top
    List <Step> steps = Arrays.asList(new AddLeg(), new AddLeg(), new AddLeg(), new AddLeg(), new AddShelf(), new AddTop());

    public TvTable build() {
        TvTable tvTable = new TvTable();
        for (Step step : steps) {
            step.perform(tvTable);

        }
        return tvTable;
    }
}

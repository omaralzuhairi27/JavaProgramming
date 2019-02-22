package week05.src.Reflection;

import org.junit.jupiter.api.Test;
import week05.src.Exercise6.AddShelf;
import week05.src.Exercise6.AddTop;
import week05.src.Exercise6.Step;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TvTableBuilderTest {
    List <Step> steps = Arrays.asList(new AddLeg(), new AddLeg(), new AddLeg(), new AddLeg(), new AddShelf(), new AddTop());

    @Test
    void build() {

        TvTable tvTable = new TvTable();
        for (Step step : steps) {
            step.perform(tvTable);

        }

        assertTrue(tvTable.parts.contains("Lege"));
        assertTrue(tvTable.parts.contains("Lege"));
        assertTrue(tvTable.parts.contains("Lege"));
        assertTrue(tvTable.parts.contains("Lege"));
        assertTrue(tvTable.parts.contains("Shelf"));
        assertTrue(tvTable.parts.contains("Top"));

    }
}
package week05.src.Exercise7;

import java.util.Arrays;
import java.util.List;

public class Moves {
    private static List<Move> moves = Arrays.asList(
            new Rock(), new Scissors(), new Paper()
    );

    public static List<Move> asList() {
        return moves;
    }

}

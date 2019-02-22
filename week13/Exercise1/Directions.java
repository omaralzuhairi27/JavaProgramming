package week13.Exercise1;

import java.util.Arrays;
import java.util.List;

public class Directions {
    private static List<Direction> direction= Arrays.asList(new North(),new West(), new East(),new South());

    public static List<Direction> asList(){
        return direction;

    }
}

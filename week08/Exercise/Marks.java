package week08.Exercise;

import java.util.Arrays;
import java.util.List;

public class Marks {

    private static List <Decrypt> marks = Arrays.asList(
            new ExclamationMark(),
            new AndMark(),
            new HashTagMark()
    );

    public static List<Decrypt> aslist() {
        return marks;
    }

}

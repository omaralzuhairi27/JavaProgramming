package week07.src.GroupExercise;

import java.util.ArrayList;
import java.util.List;

public class AsciiCode {
    public List<Integer> getAsciiCodesLetterOf(String word){
        List<Integer> codes = new ArrayList <>();
        String[] letters = word.split("");
        for (String letter : letters) {
            Integer code = (int) letter.charAt(0);
            codes.add(code);
        }

        return codes;
    }
}

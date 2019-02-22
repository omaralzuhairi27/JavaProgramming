package week07.src.GroupExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vortex {
    private FileReader reader=new FileReader();
    private AsciiCode codeProvider = new AsciiCode();

    public List<String> names(){
      List<String> names=reader.getLines("GroupExercise/participants.csv");
        return names;
    }

    public String calculateVortex(String name){
        //AsciiCode asciiCode=new AsciiCode();
        List<Integer> asciiCodes = codeProvider.getAsciiCodesLetterOf(name);
        Integer summation = getSumOf(asciiCodes);
        Integer vortex = toVortex(summation);
        return vortex.toString();
    }

    private Integer toVortex(Integer summation) {
        List<Integer> digits = getDigits(summation);
        Integer sum = getSumOf(digits);
        while(sum>9){
            sum=toVortex(sum);
        }
        return sum;
    }

    private List <Integer> getDigits(Integer summation) {
        String[] array = summation.toString().split("");
        List <String> listAsString = Arrays.asList(array);
        List<Integer> list = new ArrayList <>();

        for (String digit : listAsString) {
            list.add(Integer.valueOf(digit));
        }
                return list;
    }

    private Integer getSumOf(List <Integer> numbers) {
        Integer sum = 0;
        for (Integer integer : numbers) {
            sum+=integer;
        }
        return sum;
    }



}

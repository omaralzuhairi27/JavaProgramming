package week12.Heroes.CrossWord;

import week09.robodog.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class ReadWords {

    public static List<String> asList() {
        FileReader fileReader=new FileReader();
        return fileReader.asStream("week12/Heroes/CrossWord/words.csv")
                .skip(1)
                .map(e -> e.split(","))
                .map(e -> e[0])
                .collect(Collectors.toList());
    }
}

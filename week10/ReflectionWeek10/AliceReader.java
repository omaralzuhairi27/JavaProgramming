package week10.ReflectionWeek10;

import week09.robodog.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceReader {
    FileReader fileReader=new FileReader();

    public List<String> asList(String path){
        return  fileReader.asList(path).stream()
                .map(e -> e.replaceAll(","," "))
                .map(e -> e.replaceAll(";"," "))
                .map(e -> e.replaceAll("’s"," "))
                .map(e -> e.replaceAll("’"," "))
                .map(e -> e.replaceAll("‘"," "))
                .map(e -> e.replaceAll(":"," "))
                .map(e -> e.replaceAll("#"," "))
                .map(e -> e.replaceAll("/"," "))
                .map(e -> e.replaceAll("-"," "))
                .map(e -> e.replaceAll("\\."," "))
                .map(e -> e.replaceAll("\\*"," "))
                .map(e -> e.replaceAll("\\("," "))
                .map(e -> e.replaceAll("\\)"," "))
                .map(e -> e.replaceAll("\\["," "))
                .map(e -> e.replaceAll("\\]"," "))
                .map(e->e.toLowerCase())
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }

}
/*
.
*
(
)
[
]

 */










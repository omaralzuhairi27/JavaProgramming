package week12.Heroes.CrossWord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listOLists = new ArrayList<ArrayList<String>>();
        ArrayList<String> singleList = new ArrayList<String>();
        List<String> words=ReadWords.asList();
        Map <List <String>, List <List <String>>> collect = words.stream()
                .map(e -> Arrays.asList(e.split("")))
                .collect(Collectors.groupingBy(e -> e, Collectors.toList()));
        System.out.println(collect.values().size());

    }
}

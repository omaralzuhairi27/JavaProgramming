package week04.src.Exercise11;

import week04.src.Exercise9.FileReader;

import java.util.*;

public class HappinessApplication {
    public static void main(String[] args) {
        FileReader reader = new FileReader();
        //HappinessApplication happinessApplication=new HappinessApplication();
        redFile(reader);


    }

    public static void redFile(FileReader reader) {
        List <String> lines = reader.getLine("Exercise11/world-happiness-2017.csv");
        List <HappinessRecord> happinessRecords = getTheValue(lines);
        Collections.sort(happinessRecords, Comparator.comparing(HappinessRecord::getRank));
        for (int i = 0; i < 5; i++) {
            System.out.println(happinessRecords.get(i));
        }

    }

    private static List <HappinessRecord> getTheValue(List <String> lines) {
        List <HappinessRecord> happinessRecords = new ArrayList <>();
        for (String line : lines) {

            HappinessRecord happinessRecord = getTheNames(line);
            happinessRecords.add(happinessRecord);
        }
        return happinessRecords;
    }

    private static HappinessRecord getTheNames(String line) {
        String[] split = line.split(";");
        List <String> columns = Arrays.asList(split);
        String country = columns.get(0);
        String rankNumber = columns.get(1).trim();
        String score = columns.get(2).trim();

        return new HappinessRecord(country, Integer.parseInt(rankNumber), new Double(score));
    }
}

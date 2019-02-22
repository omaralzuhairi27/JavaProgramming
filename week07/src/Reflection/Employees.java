package week07.src.Reflection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employees {

    public static List<Employed> asList(){
        //List<Employed> employeds= Arrays.asList()
        FileReader reader = new FileReader();
        List <String> lines = reader.getLines("Reflection/employees.csv");
        List <Employed> employeds = getTheText(lines);
        return employeds;
    }
    private static List<Employed> getTheText(List<String> lines) {
        List<Employed> texts=new ArrayList<>();
        for (String line:lines) {
            Employed text=toEmployee(line);
            texts.add(text);
        }
        return texts;
    }

    private static Employed toEmployee(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String name = columns.get(0);
        String department = columns.get(1).trim();
        String salary = columns.get(2).trim();
        String account = columns.get(3).trim();

        return new Employed(name, department,salary,account);
    }

}

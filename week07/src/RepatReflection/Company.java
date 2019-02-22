package week07.src.RepatReflection;


import week08.Exercise.FileReader;

import java.util.ArrayList;
import java.util.List;

public class Company {

    FileReader reader = new FileReader();

    public List <Employee> getEmployees() {
        List <String> lines = reader.getLines("RepatReflection/employees.csv");
        removeHeader(lines);
        return toEmployees(lines);
    }

    private List <Employee> toEmployees(List <String> lines) {
        List <Employee> employees = new ArrayList <>();
        for (String line : lines) {
            employees.add(toEmployee(line));
        }
        return employees;
    }

    private Employee toEmployee(String line) {
        String[] col = line.split(";");
        return new Employee(
                col[0],
                col[1],
                Integer.valueOf(col[2]),
                col[3]);

    }

    private void removeHeader(List <String> lines) {
        lines.remove(0);
    }

}

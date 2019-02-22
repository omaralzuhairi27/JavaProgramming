package week02.src.Exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepGatherer {
    public List<Integer> askForThereNumber(){
        List<Integer> numbers=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <=3; i++) {
            System.out.println("tell me number" +i);
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }
}

package week02.src.Exercise5;

import java.util.List;

public class AverageCalculator {
    public Double calculateAverage(List<Integer> averge){
       Integer listSize= averge.size();
       Integer value=0;
        for (int i = 0; i <listSize-1 ; i++) {
         Integer number= averge.get(i);
           value=number+value;
        }
        Double result=value.doubleValue()/listSize;
        return result;
    }
}

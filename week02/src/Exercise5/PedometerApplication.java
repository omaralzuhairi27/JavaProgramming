package week02.src.Exercise5;

import java.util.List;

public class PedometerApplication {
    public static void main(String[] args) {
        StepGatherer stepGatherer=new StepGatherer();
       List<Integer> steps= stepGatherer.askForThereNumber();
        AverageCalculator averageCalculator=new AverageCalculator();
        Double averge=averageCalculator.calculateAverage(steps);
        DistanceCalculator distanceCalculator=new DistanceCalculator();
        System.out.println(distanceCalculator.calculateDistance(averge));



    }
}

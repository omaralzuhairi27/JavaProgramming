package week02.src.Exercise6;

import java.util.Scanner;

public class Date {

    public void coordinate(Double x1,Double y1,Double x2,Double y2){
       Double distance;
       distance = Math.acos(Math.sin(x1)*Math.sin(x2));
        //distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
    public Double askForAnumber(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}

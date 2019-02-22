package week03.src;

import java.util.ArrayList;
import java.util.List;

public class Exercise10 {


    public Integer sumPositions(List<Integer> numbers, Integer position1, Integer position2){
        Integer number1=numbers.get(position1);
        Integer number2=numbers.get(position2);
        return number1+number2;
    }
    public List<Integer> calculateFibonacciNumbers(Integer amount){
        List<Integer> emptyOne=new ArrayList<>();
        if(amount==0 && amount==1){
            return emptyOne;
        }



        return  emptyOne;
    }
    public static void main(String[] args) {
        Exercise10 exercise10=new Exercise10();
    List<Integer> numbers=new ArrayList<>();
    numbers.add(0);
    numbers.add(1);

    Integer position=0;
    Integer times=0;
    while (times<9){
        Integer nextFibonacciNumber=exercise10.sumPositions(numbers,position,position+1);
        numbers.add(nextFibonacciNumber);
        position+=position;
        times+=times;
    }
    }
}

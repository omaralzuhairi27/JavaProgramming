package week03.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise4 {
        public Integer getRandumNumber(Integer number){
            Random random=new Random();
            Integer randValue=random.nextInt(number);
            return randValue;
        }
        public List<Integer> listOfNumber(Integer elements){
            List<Integer> listOfNumbers=new ArrayList<>();

            for(int i=0;i<elements;i++){
                Integer value=getRandumNumber(elements);
                listOfNumbers.add(value);

            }
            return listOfNumbers;

        }

    public static void main(String[] args) {
        Exercise4 exercise4 = new Exercise4();
       //Integer value= exercise4.getRandumNumber();
       List<Integer> listNumber= exercise4.listOfNumber(20);
        System.out.println(listNumber);


    }
}

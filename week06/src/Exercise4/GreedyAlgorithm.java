package week06.src.Exercise4;

import java.util.ArrayList;
import java.util.List;

public class GreedyAlgorithm {



    public  List<Integer> change(Integer cents){
        List<Money> moneyList=Coins.asList();
        List<Integer> result=new ArrayList <>();
        Integer num=0;

        for (int i = 0; i <moneyList.size() ; i++) {
            if(moneyList.get(i).getAmount()<=cents){
                num=cents/moneyList.get(i).getAmount();
                System.out.println(num + " : "+ moneyList.get(i).getAmount());
                for (int j = 0; j <num ; j++) {
                    result.add(moneyList.get(i).getAmount());

                }

                cents-=num*moneyList.get(i).getAmount();
            }

        }
        return result;

       
    }


}
/*Integer value=0;
        Integer value2=0;
       while (cents>0)
        for (Money money : moneyList) {
            if(cents>=money.getAmount()){
                value =cents-money.getAmount();
                value2=cents-value;
                result.add(value2);
            }
        }
*/
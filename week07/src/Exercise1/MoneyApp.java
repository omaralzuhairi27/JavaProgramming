package week07.src.Exercise1;

import java.util.List;

public class MoneyApp {
    public static void main(String[] args) {
        List<Friend> friends=MoneyCollector.collect();

        System.out.println(friends +" " +MoneyCalculator.total(friends));;

    }
}

package week07.src.Exercise1;

import java.util.List;

public class MoneyCalculator {

    public static Integer total(List <Friend> payments) {
        Integer total = 0;
        for (Friend friend : payments) {
            total += friend.getMoney();
        }
        return total;
    }

}

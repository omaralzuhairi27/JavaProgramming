package week07.src.Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MoneyCollector {

    public static List <Friend> collect() {
        List <Friend> friends = new ArrayList <>();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            Integer integer = random.nextInt(5) + 1;
            Friend friend = new Friend(("friend" + i), integer);
            friends.add(friend);
        }

        return friends;
    }


}

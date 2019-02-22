package week07.src.Exercise6;

import java.util.*;

public class SecretHandshakeMovesTranslator {
    public List<String> handshakes(Integer number){
        String word=number.toString();
        String[] immutable = word.split("");
        List <String> mutable = Arrays.asList(immutable);
        List <String> secretHandshakes = new ArrayList <>();
        Map<String,String> moves=new HashMap <>();
        moves.put("2","thumb touches");
        moves.put("5","tickles over");
        moves.put("6","bro knock");
        moves.put("9","thousand knuckles");

        for (String numberAsWord :mutable) {
            if(moves.containsKey(numberAsWord)){
                String b= moves.get(numberAsWord);
                secretHandshakes.add(b);
            }

        }
        return secretHandshakes;
    }


}

package week05.src.Exercise7;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Player2 implements Player {
    private List<Move> moves = Moves.asList();
    @Override
    public String getName() {
        return "player2";
    }

    @Override
    public Optional<Move> chooseMove() {
        Random random=new Random();
        Integer number=random.nextInt(3);

        return Optional.of(moves.get(number));
    }
}

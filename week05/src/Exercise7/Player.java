package week05.src.Exercise7;

import java.util.Optional;

public interface Player {
    String getName();
    Optional<Move> chooseMove();
}

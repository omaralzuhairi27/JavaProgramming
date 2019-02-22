package week05.src.Exercise7;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Player1 implements Player {
    private List<Move> moves=Moves.asList();
    @Override
    public String getName() {
        return "Player1";
    }

    @Override
    public  Optional<Move> chooseMove() {

        Scanner scanner=new Scanner(System.in);
       // System.out.println("Choose a Move Please: ");
        String move=scanner.nextLine();
        //Moves moves = new Moves();
        for (Move name : moves) {
            if(name.getName().equalsIgnoreCase(move)){

                return Optional.of(name);

            }

        }
       return Optional.empty();
    }


}

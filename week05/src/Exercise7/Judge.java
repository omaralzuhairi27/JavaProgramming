package week05.src.Exercise7;


import java.util.Optional;

public class Judge {

    public  void compare(Player player1, Player player2){

        Optional<Move> move1=player1.chooseMove();
        Optional<Move> move2=player2.chooseMove();
        System.out.println("Player 2 choose "+move2.get().getName());

        if(move1.get().getName().equalsIgnoreCase(move2.get().getName())){
            System.out.println("we are even");
        } else if(move1.get().getName().equalsIgnoreCase("scissors") && move2.get().getName().equalsIgnoreCase("paper") ){
            System.out.println("The winner is " + player2.getName());
        } else if(move1.get().getName().equalsIgnoreCase("rock") && move2.get().getName().equalsIgnoreCase("paper")){
            System.out.println("The winner is " + player2.getName());

        } else if (move1.get().getName().equalsIgnoreCase("scissors") && move2.get().getName().equalsIgnoreCase("rock")){
            System.out.println("The winner is " + player2.getName());
        }
        else {
            System.out.println("The winner is " + player1.getName());
        }



    }



}

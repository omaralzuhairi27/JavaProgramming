package week05.src.Exercise7;

import java.util.Scanner;

public class Game {
    Player1 player1=new Player1();
    Player2 player2=new Player2();

   public void askToPlay(){
       System.out.println("Let’s play rock, paper, scissors!\n" + "These are your options: rock, paper, scissors\n" + "Choose one: ");
       play(player1,player2);

       wantToPlayAgain();
   }

    private void wantToPlayAgain() {

        System.out.println("Do you want to play again?");
        Scanner scanner=new Scanner(System.in);
        String answer1=scanner.nextLine();
        while(isWantPlayAgain(answer1)==true){
            play(player1,player2);
            System.out.println("Do you want to play again?");
            String answer2=scanner.nextLine();
            answer1=answer2;

        }
            System.out.println("See you next time!");
    }

    private void play(Player player1,Player player2) {
       Judge judge=new Judge();

       judge.compare(player1,player2);
    }

    public Boolean isWantPlayAgain(String answer) {
        if (answer.equalsIgnoreCase("no")) {
            return false;
        }
        return true;
    }





}

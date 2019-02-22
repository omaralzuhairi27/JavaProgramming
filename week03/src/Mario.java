package week03.src;
//###############
//Norbert	#
//Omar		#
//###############



import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        Mario mario=new Mario();
        System.out.println("Please Give me a number between 1 and 23");
       mario.drawTheShape();

    }
    public void drawTheShape(){
        Integer number=enterNumber();
        Integer maxNumber=23;
        Integer minNumber=1;
        while(!validNumber(number)){
            System.out.println("Please Give me a number between 1 and 23");
            number=enterNumber();
        }
        System.out.println("Height: " +number);
        for (int height =number; height >=1; height--) {
            for (int width = 1; width < height; width++) {
                System.out.printf(" ");
            }
            for (int hashtag = number; hashtag >= height-1; hashtag--) {
                System.out.printf("#");
            }
            System.out.printf("\n");
        }

    }

    public Boolean validNumber(Integer number){

            return number<23 && number>=0;

    }
    public Integer enterNumber(){
        Integer number;
        Scanner scanner = new Scanner(System.in);
        number=scanner.nextInt();
        return number;
    }
}

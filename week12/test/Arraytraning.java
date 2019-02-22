package week12.test;

public class Arraytraning {

    public static void getRightElm(Integer[][] puzzle,int number){
        for (int i = 0; i <puzzle.length ; i++) {
            for (int j = 0; j <puzzle[i].length ; j++) {
                if(puzzle[i][j].equals(number)){
                    System.out.println(puzzle[i][j+1]);
                }
            }

        }
    }
    public static void main(String[] args) {
        Integer[][] puzzle=new Integer[][]
                {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20},
                {21,22,23,24}};
        getRightElm(puzzle,11);

    }


}


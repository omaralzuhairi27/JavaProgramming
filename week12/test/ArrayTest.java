package week12.test;

public class ArrayTest {



    public static void main(String[] args) {
        int[][] puzzle=new int[5][5];
               /*{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20},
                {21,22,23,24}};*/



        for (int i = 0; i <puzzle.length ; i++) {
            //int start = i * n;
            for (int j = 0; j <puzzle[i].length ; j++) {
                puzzle[i][j] = i * puzzle.length+ ((i % 2 == 0) ? (j + 1) : (puzzle.length - j));

                // Arrays.fill(puzzle[i][j],0);
            }

        }
        for (int i = 0; i <puzzle.length ; i++) {
            for (int j = 0; j <puzzle[i].length ; j++) {
                System.out.printf("%d\t",puzzle[i][j]);
            }
            System.out.println();

        }

    }
}

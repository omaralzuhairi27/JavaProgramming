package week12.Heroes;

public class Summation {
    public static void summation(Integer number){
        for (int i = 1; i <=(number/2) ; i++) {
            System.out.println(i+"+"+(number-i)+"="+number);

        }
    }

    public static void main(String[] args) {
        summation(9);
    }
}

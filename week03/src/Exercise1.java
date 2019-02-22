package week03.src;

import java.util.Scanner;

public class Exercise1 {
    public String inPutString(){
        Scanner scanner=new Scanner(System.in);
       String value=scanner.nextLine();
        return value;
    }
    public Integer inPutIntger(){
        Scanner scanner=new Scanner(System.in);
        Integer value=scanner.nextInt();
        return value;
    }

    public Boolean isAtHome(){
        System.out.println("Are at Home");
        if (inPutString().equals("Yes")){
            return true;
        }
        return false;

    }
    public Boolean isUsingOldTelephone(){
        System.out.println("Granma! Are you using the Telephone?");
        if (inPutString().equals("Yes")){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
    Exercise1 test= new Exercise1();
    if(test.isAtHome() &&  !test.isUsingOldTelephone()){
        System.out.println("calling the friend with the Oldphone");
    }else {
        System.out.println("calling the friend with the cellphone");

    }

    }
}

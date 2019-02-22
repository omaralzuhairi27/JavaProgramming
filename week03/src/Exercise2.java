package week03.src;

public class Exercise2 {
    Exercise1 exercise1=new Exercise1();
    public Boolean hasClicked(){
        System.out.println("Did Something Click?");
            String answer=exercise1.inPutString();
        return answer.equals("Yes");
    }
    public Boolean isAdult(){
        System.out.println("How old are You");
        Integer age=exercise1.inPutIntger();

            return age>=18;
    }
    public Boolean isValid(String name){
        return name.length()>=3;

    }

    public static void main(String[] args) {
        Exercise1 exercise1=new Exercise1();
        Exercise2 exercise2=new Exercise2();
        if(!exercise2.hasClicked() && !exercise2.isAdult()){
            System.out.println("Something Wrong");
        }
            else
            System.out.println("Please Enter Your name");
            String name=exercise1.inPutString();
            if(exercise2.isValid(name)){
                System.out.println("SignedUp");


            }else
                System.out.println("Name is not valid");



    }
}

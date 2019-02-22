package week05.juliusCaesar.src;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Encorypt {


    public List<String> encoryptMessage(String message){

        String letter="abcdefghijklmnopqrstuvwxyz";
        List<String> alphabet= Arrays.asList(letter.split(""));
        List<String> mutableLetter=new ArrayList <>(alphabet);


        List<String> text=Arrays.asList(message.split(""));
        List<String> mutableMessage=new ArrayList <>(text);


        System.out.println(mutableMessage);
        //System.out.println(letterList);
        Integer size=mutableMessage.size();
        List<String> encryptMessage=new ArrayList <>();
        for (int i = 0; i <size; i++) {
            for (int j = 0; j <mutableMessage.size() ; j++) {
                if(mutableLetter.contains(mutableMessage.get(i))){
                    // System.out.println(listLetter.get(i));
                      encryptMessage.add(mutableLetter.get(j+1));
                }

            }

          }

       return encryptMessage;
    }


}

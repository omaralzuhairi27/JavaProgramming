package reflection.src.Deliver;


import reflection.src.Post.Letter;

import java.util.ArrayList;
import java.util.List;

public class Postman {


public List<Letter> letters(){
    Letter letter=new Letter();
    List<Letter> letters=new ArrayList<>();

   //letters.add(letter.setLetter("first"));
    letter.setLetter("scand");
    letter.setLetter("third");

    letters.add(new Letter());
    letters.add(new Letter());
    return letters;

}
public void deliveLetter(List<Letter> letters){

    for(Letter letter: letters){
        System.out.println("the " +letter.getLetter()+ "has deliverd in this address"+letter.getAddress());
        letters.remove(letter);
    }
}

}

package reflection.src.Post;

public class PostOfficeAssistant {
    public void stamp(Letter letter){

        letter.stamp();

    }
    public void send(Letter letter){

        if(letter.isStamped(letter)){
            System.out.println("they can send the Letter"+letter.getAddress());
        }else{
            System.out.println("they need to stamp it ");
        }
    }
}

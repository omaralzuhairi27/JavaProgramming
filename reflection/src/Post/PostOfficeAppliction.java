package reflection.src.Post;

public class PostOfficeAppliction {
    public static void main(String[] args) {
        Letter  letter=new Letter();
        letter.setLetter("first");
        letter.setLetter("scand");
        letter.setLetter("third");
        PostOfficeAssistant postOfficeAssistant=new PostOfficeAssistant();

        postOfficeAssistant.send(letter);

        Letter letter1=new Letter();
        letter1.stamp();
        postOfficeAssistant.send(letter1);
    }
}

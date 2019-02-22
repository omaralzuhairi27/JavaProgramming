package week05.juliusCaesar.src;

public class CaesarApp {
    public static void main(String[] args) {
        BlackBox blackBox=new BlackBox();
        blackBox.setKey(1);
        blackBox.setMassege("");
        String messge="y";
        Encorypt encorypt=new Encorypt();
        System.out.println(encorypt.encoryptMessage(messge));
    }
}

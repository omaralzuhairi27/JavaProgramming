package MTWeek3.src.Exetcise4;

import java.util.List;

public class HackerApplication {
    public static void main(String[] args) {
        String text="hellourtzhjWord5";
        Encryptor encryptor=new Encryptor();


        encryptor.encryptMathematicalSymbols(text);
        encryptor.encryptNummber(text);
        List<String> text1=encryptor.encryptedText(text);
        System.out.println(encryptor.ListToString(text1));


        Decryptor decryptor=new Decryptor();
        decryptor.decryptMathematicalSymbols(text);
        decryptor.decryptNummber(text);
        List<String> text2=decryptor.decryptedText(text);
        String result2=encryptor.ListToString(text2);
        System.out.println(result2);
    }
}

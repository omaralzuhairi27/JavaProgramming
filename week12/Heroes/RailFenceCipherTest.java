package week12.Heroes;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RailFenceCipherTest {
    RailFenceCipher cipher=new RailFenceCipher();
    @Test
    void railFenceCipher() {
        String text="WEAREDISCOVEREDFLEEATONCE";
        char[][] railFenceCipher = cipher.encryptText(3, text);
        String test= cipher.decryptText(railFenceCipher);
        System.out.println(text);
        Arrays.stream(railFenceCipher)
                .forEach(System.out::println);



    }
}






package week07.src.Exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetNickNameTest {
    GetNickName nickName=new GetNickName();
    @Test
    void checkResult() {
       String name= nickName.chackName("something").get();
        assertEquals("some",name);
    }
    @Test
    void checkOneLetter(){
        String name= nickName.chackName("a").get();
        assertEquals("a",name);
    }
    @Test
    void checkNoLetter(){
        String name= nickName.chackName("").get();
        assertEquals("",name);
    }
    @Test
    void checkTwoLetter(){
        String name= nickName.chackName("ab").get();
        assertEquals("a",name);
    }
}
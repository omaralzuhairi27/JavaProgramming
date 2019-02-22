package week07.src.Exercise2;

import java.util.Optional;

public class GetNickName {
    public  Optional<String> chackName(String name){
        if(Optional.of(name).isPresent()){
            Integer length= (name.length()/2);
            if(length<1){
                return Optional.of(name);
            }
           String nickName=name.substring(0,length);
           return Optional.of(nickName);
        }

        return Optional.empty();
    }

}

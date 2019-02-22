package MTWeek3.src.Exercise3;

public class NumberCorrector {

public Integer correct(Double number){
    Integer intnumber=0;
    if(number<0){
         intnumber=number.intValue();
        return Math.abs(intnumber);
    }else {
         intnumber=number.intValue();
    }
    return intnumber;
}
}

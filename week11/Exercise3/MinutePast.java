package week11.Exercise3;

public class MinutePast implements CheckListClock {
    ChangeHoursToWords changeHour=new ChangeHoursToWords();
    @Override
    public Boolean checkMinuts(Integer number) {

        return number > 0 && number <30 ;
    }

    @Override
    public String mesg(Integer hours, Integer minutes) {
        return  changeHour.getIntegerStringMap(30-minutes)+ " past "+ changeHour.getIntegerStringMap(hours);
    }
}

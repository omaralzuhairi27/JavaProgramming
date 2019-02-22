package week11.Exercise3;

public class MinutesZero implements CheckListClock{
    ChangeHoursToWords changeHour=new ChangeHoursToWords();
    @Override
    public Boolean checkMinuts(Integer number) {
        return number==0;
    }

    @Override
    public String mesg(Integer hours, Integer minutes) {
        return changeHour.getIntegerStringMap(hours)+" o' clock";
    }
}

package week11.Exercise3;


public class MinuteTo implements CheckListClock {
    ChangeHoursToWords changeHour=new ChangeHoursToWords();

    @Override
    public Boolean checkMinuts(Integer number) {
            return number < 60 && number >= 20;
    }

    @Override
    public String mesg(Integer hours, Integer minutes) {
        return changeHour.getIntegerStringMap(60-minutes)+ " minutes to "+changeHour.getIntegerStringMap(hours+1);

    }


}

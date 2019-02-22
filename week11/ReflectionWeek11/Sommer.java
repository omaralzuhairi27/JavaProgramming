package week11.ReflectionWeek11;

import java.time.LocalDate;

public class Sommer implements CheckSolstices {


    @Override
    public Boolean checkDate(LocalDate localDate) {
        LocalDate start = LocalDate.of(localDate.getYear(),06,20);
        LocalDate end = LocalDate.of(localDate.getYear(), 12, 22);
        return localDate.isAfter(start) && localDate.isBefore(end) ;
    }

    @Override
    public String message(LocalDate localDate) {
        LocalDate end = LocalDate.of(localDate.getYear(), 6, 21);
        if (localDate.isLeapYear()) {
            return localDate.getYear() + "-" + end.getMonth() + "-" + (end.getDayOfMonth() - 1);
        } else {
            return localDate.getYear() + "-" + end.getMonth() + "-" + end.getDayOfMonth();
        }
    }
}

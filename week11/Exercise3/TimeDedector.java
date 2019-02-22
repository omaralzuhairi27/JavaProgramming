package week11.Exercise3;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

public class TimeDedector {
    List<CheckListClock> conditios=ConditionList.aslist();
    List<DaysTime> conditionsDays=DaysTimeList.asList();

    String detecteTime(Integer hours,Integer minutes){
        Optional <String> first = conditios.stream()
                .filter(e -> e.checkMinuts(minutes))
                .map(e -> e.mesg(hours, minutes) + " at " + detecteDaysTime(hours, minutes))
                .findFirst();
        return first.get();

    }
    String detecteDaysTime(Integer hours,Integer minutes){
        LocalTime time=LocalTime.of(hours,minutes);
        Optional <String> first = conditionsDays.stream()
                .filter(e -> e.checkDayTime(time))
                .map(e -> e.mesg())
                .findFirst();
        return first.get();

    }

    public static void main(String[] args) {
        TimeDedector timeDedector=new TimeDedector();

        System.out.println(timeDedector.detecteDaysTime(17,00));

    }
}

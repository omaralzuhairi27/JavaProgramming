package week11.Exercise1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Calculate {


    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println("Display Time and the day of this week");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter formatterWithSeconds = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalDateTime someDay = LocalDateTime.parse("2003-03-13T10:00");


        System.out.println(someDay.format(formatter)+" On "+someDay.getDayOfWeek());


        System.out.println("Display arrive the Limousine Time");
        LocalDateTime pickedLimousine = someDay.plusMinutes(37).plusSeconds(21);
        System.out.println(pickedLimousine.format(formatterWithSeconds));

        System.out.println("Display when he arrived to Airport");
        LocalDateTime arriveAtTheAirport=pickedLimousine.plusMinutes(90);
        System.out.println(arriveAtTheAirport.format(formatterWithSeconds));


        System.out.println("Display if he  can catch the plane");
        LocalDateTime departureTime=LocalDateTime.of(2003, 03, 13, 11, 04, 00);
        System.out.println(departureTime.isAfter(arriveAtTheAirport));

        LocalDateTime nextFlight=LocalDateTime.of(2003,03,13,18,45,00);
        //LocalDate date=LocalDate.of(2003,03,13);
        //LocalDateTime nextFlight1=LocalDateTime.parse(nextFlight);



        System.out.println("Display The Time of next Flight");
        Duration duration=Duration.between(arriveAtTheAirport,nextFlight);
       // System.out.println(duration.toHours() + ":" + duration.minusHours(duration.toHours()).toMinutes());
        System.out.println(duration.toHours()+":"+ duration.toMinutes()%60+":"+(duration.getSeconds()%60));
        System.out.println(duration.toMinutes());

        System.out.println("Display time in tokyo");
        LocalDateTime timeInLondon=nextFlight.plusHours(11).plusMinutes(50);
        ZoneId london=ZoneId.of("Europe/London");
        ZonedDateTime inLondon=timeInLondon.atZone(london);
        //ZonedDateTime tokyo=ZonedDateTime.(timeInLondon,"Asia/Tokyo")
        ZoneId tokyo=ZoneId.of("Asia/Tokyo");

        ZonedDateTime inTokyo=inLondon.withZoneSameInstant(tokyo);
        System.out.println("Time in london: "+timeInLondon.getHour()+":"+timeInLondon.getMinute());
        System.out.println("Time in tokyo: "+inTokyo.getHour()+":"+inTokyo.getMinute());

        LocalDateTime wakeUp=inTokyo.plusHours(11).toLocalDateTime();
        System.out.println("He wakes up at "+ wakeUp);


        LocalDateTime advertisementShootingStarts=wakeUp.plusMinutes(47);
        System.out.println("advertisement shooting starts at: "+advertisementShootingStarts);


        LocalDateTime phoneCall=wakeUp.plusSeconds(546);
        Duration makeUpTime=Duration.between(phoneCall,advertisementShootingStarts);
        System.out.println(makeUpTime);
        //onther sulotion
        Duration of = Duration.of(47, ChronoUnit.MINUTES);
        Duration duration1 = of.minusSeconds(546);
        System.out.println(duration1);

        LocalDateTime shootingFinish = advertisementShootingStarts.plusHours(7);
        System.out.println(shootingFinish);

        LocalDateTime lastDayInTokyo = shootingFinish.plusDays(3).plusHours(12);
        System.out.println(lastDayInTokyo);
        LocalDateTime backInLondon = lastDayInTokyo.plusHours(11).plusMinutes(50);


        ZonedDateTime inTokyo2=backInLondon.atZone(tokyo);
        ZonedDateTime inLondon1 =inTokyo2.withZoneSameInstant(london);
        System.out.println(inTokyo2);
        System.out.println(inLondon1);
        LocalDateTime withHisFans = inLondon1.toLocalDateTime().plusSeconds(12 * 173);
        LocalTime test=LocalTime.parse("00:00");
         test=test.plusSeconds(12 * 173);
        System.out.println("Time with his Fans"+test);
        System.out.println("time with his Fans in hour "+test.getHour());
        System.out.println("time with his Fans in minutes "+test.getMinute());

        System.out.println("Time After meet his Fans "+withHisFans);



    }

}

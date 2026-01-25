package certification.OCA.data_and_time;

import java.time.*;

public class main {
    public static void main(String[] args) {
        // there are 4 date/time types in java.time package
        // import java.time.*

        LocalDate now = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.now();
        ZonedDateTime nowZonedDateTime = ZonedDateTime.now();
        System.out.println("LocalDate: " + now);
        System.out.println("LocalTime: " + nowTime);
        System.out.println("LocalDateTime: " + nowDateTime);
        System.out.println("ZonedDateTime: " + nowZonedDateTime);

        // create local date:
        System.out.println("--- Create LocalDate ---");
        LocalDate d1 = LocalDate.of(2026, Month.JANUARY ,25);
        LocalDate d2 = LocalDate.of(2026, 1 ,25);//
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);

        // creating local time:
        System.out.println("--- Creating LocalTime: ---");
        LocalTime t1 = LocalTime.of(21, 30);
        LocalTime t2 = LocalTime.of(21, 30, 15);
        LocalTime t3 = LocalTime.of(21, 30, 15,145);
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
        System.out.println("t3: " + t3);

        // creating local date time:
        System.out.println("--- Creating LocalDateTime: ---");
        LocalDateTime dt1 = LocalDateTime.of(2026, Month.JANUARY, 25, 21, 30, 14);
        LocalDateTime dt2 = LocalDateTime.of(2026, 1, 25, 21, 30, 15);
        LocalDateTime dt3 = LocalDateTime.of(2026, 1, 25, 21, 30, 15, 145);
        System.out.println("dt1: " + dt1);
        System.out.println("dt2: " + dt2);
        System.out.println("dt3: " + dt3);

        // creating zoned date time:
        System.out.println("--- Creating ZonedDateTime: ---");
        ZonedDateTime zdt1 = ZonedDateTime.of(2026, 1, 25, 21, 30, 15, 145, ZoneId.of("Asia/Karachi"));
        System.out.println("zdt1: " + zdt1);

        // for the exam, you need to know how to convert between time-zones
        // 2026-11-02T13:50+05:30[<zone>]
        // subtract 5 hours 30 minutes to get UTC time -> 2026-11-02T08:20Z
        // 2026-11-02T06:05-05:00[<zone>]
        // add 5 hours to get UTC time -> 2026-11-02T11:05Z
        // just remember substract negative number is addition and addition of negative number is substraction



    }
}

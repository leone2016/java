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

        System.out.println(" --------------------------------------------- ");

        System.out.println("""
                Date/Time Methods to Remember:
                1. LocalDate plusDays(), plusWeeks(), plusMonths(), plusYears()
                2. LocalDate minusDays(), minusWeeks(), minusMonths(), minusYears()
                3. LocalTime plusHours(), plusMinutes(), plusSeconds(), plusNanos()
                4. LocalTime minusHours(), minusMinutes(), minusSeconds(), minusNanos()
                5. LocalDateTime plusDays(), plusWeeks(), plusMonths(), plusYears()
                6. LocalDateTime minusDays(), minusWeeks(), minusMonths(), minusYears()
                7. ZonedDateTime plusDays(), plusWeeks(), plusMonths(), plusYears()
                8. ZonedDateTime minusDays(), minusWeeks(), minusMonths(), minusYears()
                9. all date/time types have with() method to change specific field
                10. all date/time types have get() methods to retrieve specific field
                11. all date/time types are immutable - methods return new instance
                12. all date/time types have isBefore(), isAfter(), isEqual() methods
                13. all date/time types have until() method to calculate period/duration between two instances
                14. all date/time types have atStartOfDay() method to convert LocalDate to LocalDateTime at start of day
                15. LocalDateTime has atZone() method to convert to ZonedDateTime
                16. ZonedDateTime has toLocalDateTime() method to convert to LocalDateTime
                17. all date/time types have formatter() method to format date/time using DateTimeFormatter
                18. all date/time types have parse() method to parse date/time from string using DateTimeFormatter
                19. ZonedDateTime has withZoneSameInstant() and withZoneSameLocal() methods to change time-zone
           
                """);

        LocalDate date = LocalDate.of(2026, 1, 25);
        LocalDate newDate = date.plusDays(2);
        System.out.println("Original date: " + date);
        System.out.println("New date after adding 2 days: " + newDate);
        LocalDate addMonthsDate = date.plusMonths(3);
        System.out.println("New date after adding 1 month: " + addMonthsDate);
        LocalDate plusYearsDate = date.plusYears(1);
        System.out.println("New date after adding 1 year: " + plusYearsDate);

        System.out.println("""
                
                Just REMEMBER: 
                - LocalDate, LocalTime, LocalDateTime, ZonedDateTime are immutable
                - all methods return new instance with updated value
                - you can not apply seconds to LocalDate, because it does not have time component
                - you can not apply months to LocalTime, because it does not have date component
                - Be careful which methods could be applied on which date/time type: example
                    - LocalDate plusDays(), plusWeeks(), plusMonths(), plusYears()
                    - LocalTime plusHours(), plusMinutes(), plusSeconds(), plusNanos()
                    - similar for minus methods
                  
                """);

        LocalDateTime dateTime = LocalDateTime.of(2026, Month.JANUARY, 15, 17, 30);
        dateTime = dateTime.minusDays(5).plusHours(3).minusSeconds(45);
        System.out.println("Updated LocalDateTime: " + dateTime);

        System.out.println(" --------------------------------------------- ");

        System.out.println("""
                
                Period can be used only with date-based types: LocalDate and LocalDateTime
                Duration can be used only with time-based types: LocalTime, LocalDateTime, and ZonedDateTime
                
                """);

       Period period = Period.ofDays(10);
       Period period2 = Period.ofWeeks(3);
       Period period3 = Period.ofMonths(1);
       Period period4 = Period.ofYears(1);
       LocalDate startDate = LocalDate.of(2026, 1, 1);
       LocalDate endDate = startDate.plus(period);
       System.out.println("Start Date: " + startDate);
       System.out.println("End Date after adding period of 10 days: " + endDate);
        System.out.println(period);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);

        Period period5 = Period.of(2, 3, 10); // 2 years, 3 months, 10 days
        System.out.println("Period of 2 years, 3 months, 10 days:); " + period5);


    }
}

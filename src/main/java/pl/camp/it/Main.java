package pl.camp.it;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);

        Instant instant = Instant.now();

        System.out.println(instant);

        Instant instant2 = Instant.now();
        Duration duration = Duration.between(instant, instant2);

        System.out.println(duration);

        LocalDate localDate = LocalDate.now();

        LocalDate yesterdayDate = LocalDate.of(2020, 9, 12);

        System.out.println(yesterdayDate);

        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);

        LocalTime time12 = LocalTime.of(12, 00, 00, 500000000);

        System.out.println(time12);

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(zonedDateTime);

        ZonedDateTime customDate = ZonedDateTime.of(
                        LocalDateTime.of(
                                LocalDate.of(2020,05,15),
                                LocalTime.of(12,54)
                        ),
                        ZoneId.of("Europe/Warsaw")
                );

        System.out.println(customDate);


        ZonedDateTime punktWCzasiePoZmianieStrefy =
                customDate.withZoneSameInstant(ZoneId.of("America/Phoenix"));

        System.out.println(punktWCzasiePoZmianieStrefy);

        ZonedDateTime customDateWithAddedOneDay = customDate.plusDays(1);

        System.out.println(customDateWithAddedOneDay);

        System.out.println(customDate.getDayOfWeek());

        String data = "05/20/2020";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate ld = LocalDate.parse(data, formatter);

        System.out.println(ld);

        /*String formattedDate =
                ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));*/

        String formattedDate =
                ld.format(formatter);

        System.out.println(formattedDate);
    }
}


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Instant;
import java.util.Date;

public class Prog2 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        LocalDate nextWeek = date.plusWeeks(1);
        LocalTime inThirtyMin = time.plusMinutes(30);
        LocalDateTime nextMonth = dateTime.plusMonths(1);
        System.out.println(nextWeek);
        System.out.println(inThirtyMin);
        System.out.println(nextMonth);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatDate = date.format(formatter);
        System.out.println(formatDate);
        // String input="14/03/2024";
        LocalDate parsedDate = LocalDate.parse(formatDate, formatter);
        System.out.println(parsedDate);

        ZonedDateTime zonedNow = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("tokyo: " + zonedNow);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ssz");
        String formatDate1 = zonedNow.format(formatter1);
        System.out.println(formatDate1);

        Instant now = Instant.now();
        System.out.println(now);
        Instant oneHourLater = now.plusSeconds(3600);
        System.out.println(oneHourLater);

        Date oldDate = new Date();
        Instant instant = oldDate.toInstant();
        LocalDate localdate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localdate);

    }

}
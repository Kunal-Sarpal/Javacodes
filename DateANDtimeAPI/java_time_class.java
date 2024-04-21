import java.time.*;
public class java_time_class {
    public static void main(String[] args) {
        ZonedDateTime zt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zt);
        
        OffsetDateTime ot = OffsetDateTime.now();
        System.out.println(ot);
        System.out.println(zt.toOffsetDateTime());

        Period pt = Period.ofMonths(3);
        System.out.println(pt);

        MonthDay day = MonthDay.now();
        YearMonth month = YearMonth.now();
        Year year = Year.now();
        Duration d = Duration.ofMinutes(10);
        Instant instant = Instant.now();// capture a movement independent of any time zone  two instant of object will have smae value 
        Period p1 = Period.of(2, 2, 10);
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
        System.out.println(d);
        System.out.println(instant);
        System.out.println(p1.addTo(LocalDate.now())); // + happen

        



        
    }
}

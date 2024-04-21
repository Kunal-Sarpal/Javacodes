// import java.util.*;
import java.time.*;
// import java.time.temporal.*;
public class Joda_Date {
    public static void main(String[] args){
        // Date d = new Date();
        // d.setDate(23);
        // System.out.println(d);
        LocalDate dt = LocalDate.now(Clock.systemDefaultZone());
        System.err.println(dt);
        LocalDate dt1 = LocalDate.now();
        System.err.println(dt1);
        LocalDate dt2 = LocalDate.now(ZoneId.of("America/Los_Angeles"));
        System.err.println(dt2);

        // How to create a date for specific value;

        LocalDate dt3 = LocalDate.of(2004,Month.NOVEMBER,30);
        System.err.println(dt3);
        // 1 jan 1970 -> ephoch date
        LocalDate dt4 = LocalDate.ofEpochDay(20);
        System.out.println(dt4);
        LocalDate dt5 = LocalDate.parse("2002-02-22");
        System.out.println(dt5);
        LocalDate newobj = dt5.plusDays(2);
        LocalDate newobj1 = dt5.plusMonths(2);
        System.out.println(newobj);
        System.out.println(newobj1);


        // LocalTIme;

        LocalTime t1 = LocalTime.now();
        LocalTime t = t1.minusHours(4) ;
        System.out.println(t1);
        System.out.println(t);


        LocalDateTime dtt = LocalDateTime.now();
        System.out.println(dtt);
        LocalDateTime dtt1  = LocalDateTime.now();
        LocalDateTime dtt2 = dtt1.plusMonths(3);
        System.out.println(dtt2);









    }
}

// import java.time.LocalDate;
// import java.time.Month;
import java.time.*;
// import java.util.*;
import java.time.format.*;



public class Practice {
    public static void main(String[] args) {
       
        // System.out.println(System.currentTimeMillis() /1000/ 60 / 60 /24 / 365);
        // Date d = new Date("1/1/1980"); //Depricated
        // GregorianCalendar gc = new GregorianCalendar();
        // System.out.println(gc.getTimeZone().getID());
        
        // LocalDate d = LocalDate.ofEpochDay(40000);
        // LocalDate d = LocalDate.parse("2020-01-03");
        // LocalDate d1 = d.plusYears(33);
        // System.out.println(d1);

        // LocalTime t = LocalTime.now();
        // System.out.println(t);    
        
        
        // LocalDateTime dt = LocalDateTime.now();
        // System.out.println(dt.getChronology());

        // ZonedDateTime zt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // System.out.println(zt);

        // OffsetDateTime ot = OffsetDateTime.now();
        // // System.out.println(ot.GET);
        // MonthDay md = MonthDay.now();
        // System.out.println(md.getDayOfMonth());
        
        // Period p = Period.of(2024,1,3);
        // System.out.println(p);
        // Year y = Year.now();
        // Month m = Month.of(2);

        // System.out.println(m);
        // Instant i = Instant.now();
        // System.out.println(i);

        // LocalDate localdate = LocalDate.now();
        String dat = "2024-03-01";
        LocalDate newdate= LocalDate.parse(dat);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MMMM-dd");

        System.out.println(newdate);
        System.out.println(newdate.format(df));
        

    }
}

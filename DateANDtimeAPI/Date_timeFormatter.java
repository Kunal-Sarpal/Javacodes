import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoField;

public class Date_timeFormatter {

    public static void main(String[] args) {
        
        ZonedDateTime dt = ZonedDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("M -- dd -- yyyy hh:mm:ss z Z");
    // y = year
    // M = month
    // d = day
    // h = Hour(0-12)
    // H = Hour(0-24);
    // m = minutes
    // s = seconds
    // S = milliseconds
    // z = time zone
    // Z = offset
    
        System.out.println(df.format(dt));
        System.out.println(dt.get(ChronoField.YEAR));
    }

}

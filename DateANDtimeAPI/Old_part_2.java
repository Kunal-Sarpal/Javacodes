import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;

public class Old_part_2{
// We follow Gregorian calendar
public static void main(String[] args){

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));

        // sun - sat 1 - 7
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        TimeZone tz = gc.getTimeZone();
        gc.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println(tz.getID());
        
}
}
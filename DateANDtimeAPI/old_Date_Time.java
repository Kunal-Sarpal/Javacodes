import java.util.*;

public class old_Date_Time {
    // Date is represented by a Long number
    // --> Starting-Time -> 1 jan 1970;
    // -->Starting-Year -> 1900
    public static void main(String[] args) {

        
        System.out.println("Current MilliSecond: " + System.currentTimeMillis());
        System.out.println("Long MaxLong: " + Long.MAX_VALUE);

        Date d = new Date(); // old Class
        System.out.println(d);
        // sun - mond -- 0 ... 1
        // jan - dec -- 0 ... 11
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear() + 1900);
    }
}
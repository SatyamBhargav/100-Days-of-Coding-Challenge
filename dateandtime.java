
/*
 * Question of the day
 * https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 */

 /*
  * for understanding the code read about Calender class in java
  */

import java.util.*;

public class dateandtime {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println((getDay(day, month, year)).toUpperCase());
    }

    public static String getDay(String day, String month, String year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.valueOf(year), (Integer.valueOf(month) - 1), Integer.valueOf(day));
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
    }
}

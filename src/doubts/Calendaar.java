package doubts;
import java.util.Calendar;

public class Calendaar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.OCTOBER, 11);
        int x=calendar.get(Calendar.WEEK_OF_YEAR);
        int y=calendar.getWeekYear();
        System.out.println(x);
    }
}



//public class Calendaar {
//    public static void main(String[] args) {
//        // Create a Calendar instance
//        Calendar calendar = Calendar.getInstance();
//
//        // Optionally set the date if you want a specific date
//        // calendar.set(2024, Calendar.OCTOBER, 11); // year, month (0-based), day
//
//        // Get the week of the year
//        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
//
//        // Get the day of the week
//        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
//
//        // Convert day of the week to a string
//        String dayName = "";
//        switch (dayOfWeek) {
//            case Calendar.SUNDAY:    dayName = "Sunday"; break;
//            case Calendar.MONDAY:    dayName = "Monday"; break;
//            case Calendar.TUESDAY:   dayName = "Tuesday"; break;
//            case Calendar.WEDNESDAY: dayName = "Wednesday"; break;
//            case Calendar.THURSDAY:  dayName = "Thursday"; break;
//            case Calendar.FRIDAY:    dayName = "Friday"; break;
//            case Calendar.SATURDAY:  dayName = "Saturday"; break;
//        }
//
//        // Print the week number and day of the week
//        System.out.println("Week of the year: " + weekOfYear);
//        System.out.println("Day of the week: " + dayName);
//    }
//}
//

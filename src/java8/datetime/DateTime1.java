package java8.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime1 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();//factory method
        System.out.println(date);
        LocalTime time= LocalTime.now();
        System.out.println(time);
        int dd=date.getDayOfMonth();
        int mm=date.getMonthValue();
        int yy=date.getYear();
        System.out.println(dd+"..."+mm+".."+yy);
    }
}

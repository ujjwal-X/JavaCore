package java8.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class CreateLocalDate {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);

        //want to provide custom date
        int year = 2001;
        int month = 01;
        int dayOfMonth = 30;

        LocalDate date1 = LocalDate.of(year, month, dayOfMonth);
        System.out.println(date1);

        Month monthFromDate = date1.getMonth();
        System.out.println(monthFromDate);

        int monthInInteger = date1.getMonthValue();
        System.out.println("Month is :" + monthInInteger);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);

        //Add using plusDays method   we can add months as well as year also
        LocalDate currentPlusFive = date.plusDays(5);
        System.out.println(date + " after 5 days " + currentPlusFive);

        LocalDate afterOneMonth = currentPlusFive.plusMonths(1);
        System.out.println(afterOneMonth);

        int lengthOfYear = date.lengthOfYear();
        System.out.println(lengthOfYear);

        //leap or not returns boolean
        boolean k = date.isLeapYear();
        System.out.println(k);

        int lengthOfMonth = currentPlusFive.lengthOfMonth();
        System.out.println(lengthOfMonth);

//        Date dt = new Date();
//        LocalDate localDateFromDate = dt.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        System.out.println(dt + " --- " + localDateFromDate);

        String dateInStringFormat = "2020-09-12";

        LocalDate dateFromString = LocalDate.parse(dateInStringFormat);
        System.out.println(dateInStringFormat);

        String stringFromDate = dateFromString.toString();

        System.out.println(stringFromDate);



    }
}

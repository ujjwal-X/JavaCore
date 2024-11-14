package java8.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodDuration {
    public static void main(String[] args) {
        LocalDate joiningDate = LocalDate.of(2015, 6, 23);
        LocalDate resignDate = LocalDate.now();

        //period between  joining and resignation
        Period period=Period.between(joiningDate,resignDate);
        System.out.println(period.getDays()+" "+period.getMonths()+" " +period.getYears());

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("Years:" + years);
        System.out.println("Months:" + months);
        System.out.println("Days:" + days);

        long totalMonths = period.toTotalMonths();
        System.out.println("Total Months:" + totalMonths);

        LocalTime startTime = LocalTime.of(12, 00, 23);
        LocalTime endTime = LocalTime.now();

        Duration duration = Duration.between(startTime, endTime);
        System.out.println(duration);

        System.out.println("Hours:" + duration.toHours());
        System.out.println("Minutes:" + duration.toMinutes());
        System.out.println("Seconds:" + duration.getSeconds());

    }
}

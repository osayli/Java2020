package day19passbyvaluedatetimeclasses;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {

    Date date1=new Date();
        System.out.println(date1.getTime());//1646327231299==>Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this date.

        //LocalDate
        System.out.println(LocalDate.now());//2022-03-03==>Returns the current date using the system clock and default time-zone, not null
        System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo")));//2022-03-04

        //how to get future dates
        System.out.println(LocalDate.now().plusDays(100));//2022-06-11
        System.out.println(LocalDate.now().plusMonths(25));//2024-04-03

        //how to get past dates
        System.out.println(LocalDate.now().minusDays(30));//2022-02-01
        System.out.println(LocalDate.now().minusMonths(5));//2021-10-03
        System.out.println(LocalDate.now().minusMonths(5).plusYears(2));//2023-10-03

        //Also you can use LocalTime
        System.out.println(LocalTime.now());//20:15:23.296500200
        System.out.println(LocalTime.now().getHour());//20
        System.out.println(LocalTime.now().getMinute());//15

        System.out.println(LocalDate.now().getDayOfWeek());//THURSDAY
        System.out.println(LocalDate.now().getMonth());//MARCH
        System.out.println(LocalDate.now().getYear());//2022

        System.out.println(LocalTime.now().isAfter(LocalTime.of(22,12,35)));//false
        System.out.println(LocalTime.now().isBefore(LocalTime.of(22,12,35)));//true
    }
}

package day16arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        /*
        Please split the dates and get day,month and
        the year separately on the console 25/02/2022==>
        day: 25
        month: 02
        year: 2022
         */
   String data="25/02/2002";
   String part1[]=data.split("/");
        System.out.println(Arrays.toString(part1));
        System.out.println("Day: "+part1[0]);
        System.out.println("Month: "+part1[1]);
        System.out.println("Year: "+part1[2]);

        //2. way
        System.out.println(data.split("/")[0]);
        System.out.println(data.split("/")[1]);
        System.out.println(data.split("/")[2]);


    }
}

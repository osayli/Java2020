package day06nestedifturneryswitch;

import java.util.Scanner;

public class NestedTernary01 {
    public static void main(String[] args) {
        //!!!! Interview Question
        /* Type java code by using nested ternary.
                Write a program to check if a year is leap year or not.
                If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.

         */
        // Condition ? (Ternary1) :(Ternary2)
      Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a year");
      int year=scan.nextInt();
      String leap= year%100==0  ? (year%400==0 ? "Leap Year":"Not Leap Year"):(year%4==0 ? "Leap Year":"Not Leap Year");
        System.out.println(leap);
        scan.close();
    }
}

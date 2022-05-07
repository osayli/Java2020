package day06nestedifturneryswitch;

import java.util.Scanner;

public class SwitchStatement01 {
    public static void main(String[] args) {
        /*
        Get the number of days from user and print the name of the day
        For example 1==>Sunday, 2==>Monday etc....
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number...");
        int dayNumber = scan.nextInt();

        //1. way by using if -else if
        if(dayNumber==1){
            System.out.println("Sunday");

        }
        else if(dayNumber==2){
            System.out.println("Monday");

        } else if(dayNumber==3){
            System.out.println("Tuesday");
        }else if(dayNumber==4){
            System.out.println("Wednesday");
        } else if(dayNumber==5){
            System.out.println("Thursday");
        } else if(dayNumber==6){
            System.out.println("Friday");
        } else if(dayNumber==7){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Enter a valid day number");
        }
        //2. Way solve by using Switch statement
        /*
        When to use switch: If you have more then 3 options
        switch is preferable
        switch (value or variable name) { }
         */
        switch(dayNumber){
            case 1:
                System.out.println("Sunday");
                break;// Go outside the switch statement
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default://like else in if else if loop
                System.out.println("Enter a valid day number");
                break;//This  break is optinal
        }
    }
}

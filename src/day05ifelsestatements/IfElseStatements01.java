package day05ifelsestatements;

import java.util.Scanner;

public class IfElseStatements01 {
    public static void main(String[] args) {

        //Ask user to enter a day name then
        //print "Weekday" for Monday, Tuesday, Wednesday, Thursday, Friday
        //print "Weekend Day" for Saturday and Sunday

        /*
        To compare string do not use "==" because it checks
        both values and addresses.
        To comparing string use equals method
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a day name");
        String dayName=scan.next();
        /*
        If user enters MONDAY or Monday, we can not see anything
        so use equalsIgnoreCase
         */
        //dayName=dayName.toLowerCase(); Another method
        boolean ifWeekday=dayName.equalsIgnoreCase("monday")
                ||dayName.equalsIgnoreCase("tuesday")
                ||dayName.equalsIgnoreCase("wednesday")
                ||dayName.equalsIgnoreCase("thursday")
                ||dayName.equalsIgnoreCase("friday");
        boolean ifWeekend=dayName.equalsIgnoreCase("saturday")
                ||dayName.equalsIgnoreCase("sunday");

        if(ifWeekday) {
            System.out.println("Weekday");
        }
        else if(ifWeekend){
            System.out.println("Weekend");
        }
        else{
            System.out.println("Hey user! What are you doing? It is not a day name..");

        }



    }
}

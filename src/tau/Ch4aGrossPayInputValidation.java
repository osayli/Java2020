package tau;

import java.util.Scanner;

/*
WHILE LOOP:
Each store employee makes $15 an hour. Write a program that allows the employee
to enter the number of hours worked for the week. Do not allow overtime
 */
public class Ch4aGrossPayInputValidation {

    public static void main(String[] args) {
        //initialize known variables
        int rate=15;
        int maximum=40;
        //get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner=new Scanner(System.in);
        double hoursWorked=scanner.nextDouble();

        //validate input
        while(hoursWorked>maximum||hoursWorked<0){
            System.out.println("Invalid entry. Your hours must be between 0 and 40. Try again");
             hoursWorked=scanner.nextDouble();
        }
        scanner.close();
        double grossPay=rate*hoursWorked;
        System.out.println("Gross pay $"+grossPay);
    }
}

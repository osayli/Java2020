package day04scannerifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //If it rains, I will cancel the picnic
        //Condition   ,  action
        // if(Condition) {}
              /*
         If you want to run different codes for different conditions you should use "if statement"
         */

        //Ask user to enter an integer, then
//print "Positive" on the console if the number is positive
//print "Negative" on the console if the number is negative
//print "Neuter" on the console if the number is zero
       Scanner scan =new Scanner(System.in);
        System.out.println("Enter an integer");
        int num= scan.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }
        if(num<0){
            System.out.println("Number is negative");
        }
        //one equal sign means assigning a value,with double equal sign check equality
        if(num==0){
            System.out.println("Number is zero");
        }


    }
}

package day06nestedifturneryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
       /*
       If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
        */
        //1. way using if-else

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter an integer");
        int k=scan.nextInt();
        if (k>0) {
            System.out.println("The integer is Positive");
        }
        else{
            System.out.println("The integer is not positive");
        }
        // 2. way by using Ternary
        //Steps:Condition put Qustion Mark(?) Result for happy scenario  Colon Result for negative scenario
        //1-Condition 2-Question mark 3-:Result for happy senario 4-colon:  5-negative senario;
        String result=k>0    ?   "The integer is Positive"    : "The integer is not positive";
        System.out.println(result);
        //Write a program to print the minimum of 2 integers on the console. Use ternary...
        int a=12;
        int b=130;
        int minimum= a<b  ?  a : b;
        System.out.println(minimum);
        scan.close();

    }
}

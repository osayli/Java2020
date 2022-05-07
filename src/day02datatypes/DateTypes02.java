package day02datatypes;

import java.sql.SQLOutput;

public class DateTypes02 {
    public static void main(String[] args) {
        // Create a char variable and print it on the console
        //Every character has an integer value in IT area. Those values are called ASCII Values
        //Note If you use char in a mathematical operation, Java uses its ASCII value in the operation
        char initials='A';
        System.out.println(initials+1);//66

        //Type code to find ASCII value of !
        char e='!';
        System.out.println(e+0);
        //Type code to find the sum of the ASCII values of X y and?
        char c1='X', c2='y', c3='?';
        System.out.println(c1+c2+c3);

        //Create 2 int variables whose values 5 and 2 then print the result of first is divided by second
        int i=5, k=2;

        //İf you use just int data type in mathematical operation result will be in int data type
        System.out.println(i/k);// =2 İnt/int result also int
        double m=5; int n=2;
        System.out.println(m/n);
        // In how many ways you can fix the following isssue? float z=2.5;
        float z=2.5f;
        double r=2.5;
        // What is the output of the following?
        System.out.println(2+3+"Ali");//5Ali
        System.out.println(2+'a'+"B"+(3+4));// 99B7

    }
}

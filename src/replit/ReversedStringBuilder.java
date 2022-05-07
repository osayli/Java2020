package replit;

import java.util.Scanner;

public class ReversedStringBuilder {
    /*
    Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder
     and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.
Input :
I love Java.
Output:
Reversed sentence : avaJ evol I. It is not a palindrome"
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        StringBuilder sb1=new StringBuilder(scan.nextLine());
        StringBuilder sb2=new StringBuilder();
        sb2=sb1;
        String sb3=sb2.reverse().toString().toLowerCase();
        String sb4=sb1.toString().toLowerCase();
        System.out.println(sb1);
        System.out.println(sb2);
        if(sb3.equals(sb4)){
            System.out.println("It is a Palindrome.");
        }else{
            System.out.println("It is not a Palindrome.");
        }

    }
}

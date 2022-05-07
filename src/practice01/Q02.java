package practice01;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
/*
Ask user to enter his kid's name,
if the name contains both "a" and "z"  output will be "This name contains 'a' anz 'z'"
if the name contains "a"               output will be "This name contains 'a'."
if the name contains "z"               output will be "This name contains 'z'."
Otherwise, output will be             "This name contains neither 'a' nor 'z'."
*/
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter your kid's name");
        String kidName=scan.nextLine();
        kidName=kidName.toLowerCase();

        if(kidName.contains("a") &&kidName.contains("z")  ){
            System.out.println("This name contains 'a' and 'z'");
        }else if(kidName.contains("a") ){
            System.out.println("This name contains 'a'");
        }else if(kidName.contains("z") ){
            System.out.println("This name contains  'z'");
        }else{
            System.out.println("This name contains neither 'a' and 'z'");

        }
        scan.close();
    }
}

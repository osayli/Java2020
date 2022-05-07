package practice02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
  /*
Write a Java program to take the last three characters
from a given string and add these three characters
 at both the front and back of the string.
String length must be at least three and more.
INPUT      : Ankara
   OUTPUT  : araAnkaraara
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=scan.nextLine().trim();
        if(s.length()<3){
            System.out.println("Please enter at least 3 character");
        }
        String lastThree=s.substring(s.length()-3,s.length());
        String result=lastThree+s+lastThree;
        System.out.println(result);


    }
}

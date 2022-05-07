package practice01;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
       /*
Ask user to enter a number. If the number is less than 10 and greater
than or equal to 0, calculate its cube. Otherwise, calculate its square.
Cube of a = a*a*a Square of a = a*a
*/
Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer");
        int num=scan.nextInt();
        int result= num<10&& num>=0 ? num*num*num :num*num;
        System.out.println(result);
        System.out.println(num<10&& num>=0 ? "The cube is :"+num*num*num :"The square is:"+num*num);
        scan.close();
    }
}

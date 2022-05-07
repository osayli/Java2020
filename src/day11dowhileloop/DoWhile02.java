package day11dowhileloop;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
       /*
Ask user to enter an integer.
If the integer is less than 100, tell user "Won!"
Otherwise, tell user "Lost!"
If user wins, ask another integer-until loosing.
 */

Scanner scan=new Scanner(System.in);
int num=0;
do{
    System.out.println("Enter an integer");
    num=scan.nextInt();
    if(num<100){
        System.out.println("Won");
    }


}while(num<100);
        System.out.println("Lost");
    }
}

package practice02;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
     /*
Type a program to check if a positive number is perfect or not
For example if the number is 6, we should see
Perfect Number
on the console.
(The factors of 6 are : 1,2,3,6
1+2+3=6  ==> it is perfect number )
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int isPerfect=scan.nextInt();
        int flag=0;
        for (int i = 1; i < isPerfect; i++) {
            if(isPerfect%i==0){
             flag=flag+i;
            }
        }
        if(flag==isPerfect){
            System.out.println(isPerfect+": is Perfect number");
        }else{
            System.out.println(isPerfect+": is not Perfect number");
        }
    }
}

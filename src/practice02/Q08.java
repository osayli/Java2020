package practice02;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {


   /*
Get the number of rows from user then draw a right triangle by using asterixs
Number of rows = 4 ==>    *
                          * *
                          * * *
                          * * * *
*/
Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int r=scan.nextInt();
        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}

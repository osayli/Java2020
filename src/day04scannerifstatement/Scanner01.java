package day04scannerifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
      /*
      Type a program which calculates the volume of a rectangular prism
       whose length, width, and height are entered by user.
    Hint: Volume of a rectangular prism is width x length x height
       */
Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length");
        double a=scan.nextDouble();
        System.out.println("Enter the width");
        double b=scan.nextDouble();
        System.out.println("Enter the height");
        double c=scan.nextDouble();
        double d=a*b*c;
        System.out.println("The valume is:"+d);

    }
}

package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
      // Type a code to calculate perimeter and area of a rectangular.
        // Get width and lenght of rectangular   from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width of rectangular");
        double width=scan.nextDouble();
        System.out.println("Enter the length of rectangular");
        double length=scan.nextDouble();
        double perimeter=2*(width+length);
        double area=width*length;
        System.out.println("The perimeter of rectangular is: "+perimeter);
        System.out.println("The area of rectangular is: "+area);
        //2. way
        System.out.println("Enter the width and length of rectangular");
        double width1=scan.nextDouble();
        double length1=scan.nextDouble();
        double perimeter1=2*(width1+length1);
        double area1=width1*length1;
        System.out.println("The perimeter of rectangular is: "+perimeter1);
        System.out.println("The area of rectangular is: "+area1);
    }

}

package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        // Ask user the price of t-shirt

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the price of t-shirt");
        double price= scan.nextDouble();
        System.out.println("The price of t-shirt is: " +price+"€");




    }

}

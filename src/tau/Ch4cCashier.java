package tau;

import java.util.Scanner;

/*
FOR LOOP:
Write a cashier program that will scan a given number of
items and tally the cost
 */
public class Ch4cCashier {
    public static void main(String[] args) {

        //get the number of items to scan
        System.out.println("How many items you would lile to scan:");
        Scanner scanner=new Scanner(System.in);
        int quantity=scanner.nextInt();
        double total=0;

        //create loop to iterate through all of the items and accumulate the cost
        for (int i = 0; i <quantity ; i++) {
            System.out.println("Enter the cost of "+(i+1)+". item:");
            double price=scanner.nextDouble();
            total=total+price;
        }
        scanner.close();
        System.out.println("the total cost is $"+total);
    }
}

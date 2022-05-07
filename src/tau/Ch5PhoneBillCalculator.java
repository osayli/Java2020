package tau;
/*
So, what you're going to do is allow the user to input the plan fee and the number of overage minutes.
And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.

I want you to create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.

Please print this as an itemized bill. I have an example of the output expected down below.

Good luck.

Example Output:

Enter base cost of the plan:
82.45
Enter overage minutes:
9
Phone Bill Statement
Plan: $82.45
Overage: $2.25
Tax: $12.71
Total: $97.41
 */

import java.util.Scanner;

public class Ch5PhoneBillCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter base cost of the plan:");
        double base=scanner.nextDouble();
        double overageFee=overageFee();
        double tax=tax(overageFee,base);
        finalTotal(base,tax,overageFee);
    }
    public static double tax(double overageeFee,double base){
        double tax=(overageeFee+base)*0.15;
        return tax;
    }
    public static double overageFee(){
        System.out.println("Enter overage minutes:");
        int overageMinute = scanner.nextInt();
        double overageFee=overageMinute*0.25;
        return overageFee;
    }
    public static void finalTotal(double base,double tax,double overageFee){
        double finalTotal=base+overageFee+tax;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overageFee));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));

        System.out.println(finalTotal);

    }
}

package helpeachother;

import java.util.Scanner;

public class FirstAndLastDigit {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.println("Enter 4 digits integer");
        int num=scan.nextInt();
        int firstDigit= num/1000;
        int lastDigit=num%10;
        if(firstDigit<1||firstDigit>9) {
            System.out.println("Please enter only 4 digit number");
        }else {
            System.out.println(firstDigit + lastDigit);
        }

    }
}

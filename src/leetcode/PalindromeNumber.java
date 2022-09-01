package leetcode;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("Enter any integer to check if it is palindrome or not");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(isPalindrome(number));
    }


    public static boolean isPalindrome(int x) {

        if (x<0){
            return false;
        }
        int original=x;
        int reversed=0;

        while(x!=0){

            reversed=reversed*10+x%10;
            x=x/10;

        }

        return reversed==original;
    }
}

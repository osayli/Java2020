package replit;

import java.util.Scanner;

class SumOfDigitInString {
    /*
    Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

input : ade1r4d3

output : 8

     Hint :
     Use Character.isDigit()
     Integer.valueOf()
  ​
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=scan.nextLine();
        sumOfDigit(str);


    }
    public static void sumOfDigit(String str){
        int sum=0;

        for (int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(Character.isDigit(ch)){
                sum=sum+Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);
    }
}

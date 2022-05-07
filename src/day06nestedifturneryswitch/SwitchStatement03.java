package day06nestedifturneryswitch;

import java.util.Scanner;

public class SwitchStatement03 {
    public static void main(String[] args) {
        /*
        Create simple calculator which does addition, subtraction,division,  multiplication and percentage
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double firstNumber = scan.nextDouble();
        System.out.println("Enter second number");
        double secondNumber = scan.nextDouble();
        System.out.println("Select Operation +,-,*,/ or %");
        char operation=scan.next().charAt(0);
        switch(operation){
            case '+':
                System.out.println(firstNumber+secondNumber);
                break;
            case '-':
                System.out.println(firstNumber-secondNumber);
                break;
            case '*':
                System.out.println(firstNumber*secondNumber);
                break;
            case '/':
                System.out.println(firstNumber/secondNumber);
                break;
            case '%':
                System.out.println(firstNumber*secondNumber/100);
                break;
            default:
                System.out.println("Invalid operation for that calculator");
        }
     /*
     Note: In switch method parenthesis you can use just the following data types
     1) int 2)byte 3)short 4)char 5)String
     Note: In switch method parenthesis you can not use
     1)long 2)Boolean 3)double 4)Float
     */
     /*   boolean d=true;
     switch (d){
     it will be complain
      */





    }
}

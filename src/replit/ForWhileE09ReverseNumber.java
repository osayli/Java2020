package replit;

import java.util.Scanner;

public class ForWhileE09ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Please enter any integer to reverse");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int number2=number;
        int counter=0;
        if(number<0) {
            number = number * (-1);
            counter++;
        }
        //1. way
        int reversed=0;
        while(number!=0){
          reversed=reversed*10+number%10;
          number=number/10;
        }
        if(counter==1){
            reversed=reversed*(-1);
        }
        System.out.println("Reverse Of The Number: "+reversed);

        //2. way
        int counter2=0;
        if(number2<0) {
            number2 = number2 * (-1);
            counter2++;
        }
        int reversed2=0;
        for (; number2 !=0; number2/=10) {
            reversed2=reversed2*10+number2%10;
        }
        if(counter2==1){
            reversed2=reversed2*(-1);
        }
        System.out.println("Reverse Of The Number: "+reversed2);
    }
}

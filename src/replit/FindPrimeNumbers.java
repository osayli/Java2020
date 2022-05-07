package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindPrimeNumbers {
    /*
    Write a program that accepts an integer as input and prints first 10 prime numbers greater than input Check numbers if they are even or not in a return method.

Input : 5

Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int startingNumber=scan.nextInt();
       List<Integer> primeList=new ArrayList<>();
        int counter =0;
        while(counter<1) {
            int checkPoint=0;
            startingNumber++;
            for (int i = 2; i < startingNumber / 2; i++) {
                if (startingNumber % i != 0) {
                    checkPoint++;
                }
            }
            if(checkPoint==(startingNumber / 2-1)){
               counter++;
               primeList.add(startingNumber);
            }
        }

        System.out.println(primeList);
    }
}

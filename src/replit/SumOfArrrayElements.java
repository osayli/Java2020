package replit;

import java.util.Scanner;

public class SumOfArrrayElements {
    /*
    Write a method that accepts an array as parameter and returns sum off all elements in the array Then print the result in the main method.

Eg :

input : {1,2,3,4,5,6,7,8};

output: 36
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an array length");
        int length = scan.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter " + i + ". index element of array");
            arr[i] = scan.nextInt();
        }
            sumOfArrayElements(arr);
    }

        public static void sumOfArrayElements(int arr[]){
            int sum = 0;
            for (int w : arr) {
                sum = sum + w;
            }
            System.out.println("The sum of the array elements is: "+sum);
        }

}

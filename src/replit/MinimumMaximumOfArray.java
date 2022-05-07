package replit;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumMaximumOfArray {
    /*
    Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

Input : {3,2,5,4,1,6}

Output :

min: 1

max: 6
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter an array length");
        int length=scan.nextInt();
        int arr[]=new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter "+i+". index element of array");
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        int min=arr[0];
        int max=arr[arr.length-1];
        System.out.println("min: "+min);
        System.out.println("max: "+max);
    }
}

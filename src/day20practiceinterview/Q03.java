package day20practiceinterview;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /* Type a code that takes array and
   returns the difference between the biggest and the smallest numbers.
   Ask user to enter array elements.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length=scan.nextInt();
        int arr[]=new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the  element that index of: "+i);
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The difference between smallest and largest : "+ (arr[arr.length-1]-arr[0]));


    }
}

package practice08;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    /*
    /*
   Ebay Interview Question
   Create an array and get elements of array from user
   Put all zeros to end in an integer array
   {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
   {0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an array length");
        int length = scan.nextInt();
        int arr[] = new int[length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter " + (i + 1) + ". element of array");
            int num = scan.nextInt();
            if (num != 0) {
                arr[idx] = num;
                idx++;
            }
        }
            System.out.println(Arrays.toString(arr));
     //   Arrays.sort(arr); //not working for negative numbers
       // System.out.println(Arrays.toString(arr));
    }
}


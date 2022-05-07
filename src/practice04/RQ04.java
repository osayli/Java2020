package practice04;

import java.util.Arrays;
import java.util.Scanner;

public class RQ04 {
    public static void main(String[] args) {
              /*
        Task:  Ask user to enter an integer, and create a squared multidimensional Array
Example: If user enters 3 ==> [[3, 3, 3],[3, 3, 3],[3, 3, 3]]
         If user enters 4 ==> [[4, 4, 4, 4], [4, 4, 4, 4], [4, 4, 4, 4], [4, 4, 4, 4]]
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer");
        int length=scan.nextInt();
        if(length<0){
            System.out.println("Please enter non negative number");
        }else{
            int arr[][]= new int[length][length];
            for(int i[]:arr){
                for (int j:i) {
                    arr [j][j]=length;

                }
            }
            System.out.println(Arrays.deepToString(arr));
        }
    }
}

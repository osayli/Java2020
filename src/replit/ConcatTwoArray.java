package replit;

import java.util.Arrays;

public class ConcatTwoArray {
    /*
    Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.

Input1={1,2,3,4}

Input2={5,6}

Output={1,2,3,4,5,6}
     */
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={5,6};
        System.out.println(Arrays.toString(concatTwoArray(arr1,arr2)));
    }
    public static int[] concatTwoArray(int a[],int b[]){
        int result[]=new int[a.length+b.length];
        for (int i = 0; i <a.length ; i++) {
            result[i]=a[i];
        }
        for (int i = a.length; i <a.length+b.length; i++) {
            result[i]=b[i-a.length];
        }
        return result;
    }
}

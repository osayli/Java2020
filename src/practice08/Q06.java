package practice08;

import java.util.Arrays;

public class Q06 {
    /*
   Create an array and create a  method to find the number of positive numbers and sum of
the non-positive numbers
Return type must be int array
[a,b]
 */

    public static void main(String[] args) {

        int arr[]= {2,6,1,-9,-7,-2}; // [3, -18]

        System.out.println(Arrays.toString(countPosAddNonPos(arr)));
    }
    public static int[] countPosAddNonPos(int arr[]){
     int  numberOfPos=0;
     int sumOfNegative=0;
        for (int w:arr) {

            if(w>0){
                numberOfPos++;
            }else{
                sumOfNegative=sumOfNegative+w;
            }
        }
        int result[]={numberOfPos,sumOfNegative};
        return result;
    }
}


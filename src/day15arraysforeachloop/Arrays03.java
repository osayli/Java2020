package day15arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {


        //Task: how to check an element if it exists in array or not.
        /*
        //note 1: binarysearch() method returns the index of existing element
         // note 2: binarysearch() method returns the order number with negative sign for non-existing elements
         // note 3: to use binarysearch() method you have to use sort() method otherwise the output will not be meaningful
         // note 4: do not use binarysearch() method for repeated elements, it does not give correct answer everytime
         */

        int arr[]={32,14,2,11};//2
        int k=50;//searching value

        //1.way
        for(int w:arr){
           if(w==k){
               System.out.println(w+" exists..");
               break;
           }
        }
           //2. way binarySearch() method
           Arrays.sort(arr);
        System.out.println("index of "+k+" is:" +Arrays.binarySearch(arr,k));




    }
}

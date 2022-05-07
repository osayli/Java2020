package day17multidimensionalarrayslists;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {

      //Task: Print the elements which have “a” from a 2 dimensional String array
        String arr1[][] = { {"learn", "java", "it"}, {"is","easy"} };
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if(arr1[i][j].contains("a")){
                    System.out.print(arr1[i][j]+" ");
                }
            }
        }
        System.out.println();
        //2nd Solution
        for (String[] w:arr1) {
            for (String w2:w) {
                if (w2.indexOf("a")>=0){
                    System.out.print(w2+" ");
                }
            }
        }
        System.out.println();
        //3rd Solution Mr. Alptekin Solution
        for(String[] w: arr1){
            for(String k: w){
                if(k.contains("a")){
                    System.out.print(k+" ");
                }
            }
        }
        System.out.println();

        /*
        Task:Convert arr1 to one dimensional array
        arr1[][] = { {"learn", "java", "it"}, {"is","easy"} };==>ars[] = {"learn", "java", "it",is","easy" };
         */
        //Find the total number of elements in an array
        int sum=0;
        for (String[] w:arr1) {
            sum=sum+w.length;
        }
        //create a one-dimensional array whose length equals to the total number of elements in arr1

        String newArr[]=new String[sum];
        String str[]=new String[sum];
        //Transfer elements from arr1 to newArr
        //1st way with for each loop
        int idx=0;
        for(String[] w:arr1){
            for(String m:w){
               newArr[idx]=m;
               idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));
        //2nd way with for loop
        int s=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                str[s]=arr1[i][j];
                s++;
            }
        }
        System.out.println(Arrays.toString(str));

    }
}

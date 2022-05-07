package day16arrays;

import java.util.Arrays;

public class Arrays08 {
    public static void main(String[] args) {

        //Type code to find if a given element exists in the given array

        int arr[]={34,52,12,37,29};
        int s=12;
        Arrays.sort(arr);
        int ss= Arrays.binarySearch(arr,s);
        if(ss>=0){
            System.out.println(s+" exists in the given array");
        }else{
            System.out.println(s+" does not exist in the given array");
        }
        //2. way
        int arr1[]={34,52,12,37,29};
        int expectedElement=12;
        boolean isExist=false;
        for (int x:arr1) {
            if(x==expectedElement){
                isExist=true;
                break;
            }
        }
if(isExist){
    System.out.println("exist..");
}else{
    System.out.println("Not exist");
}
//Quiz question
String a="I like to move it move it";
String arrt[]=a.split("it");
        System.out.println(arrt.length);
    }
}

package replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveElement {
    /*
write a Java program to removes a specific element from an array and put the remaining
elements in a new array and prints the new array
Input :{1,2,3,4,5,6}
element:6
Output : [1,2,3,4,5]
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the element which will be removed");
        int removed=scan.nextInt();
        int arr[]={1,2,3,4,5,6};
        List<Integer> removedList=new ArrayList<>();
        for(int w:arr){
            if(w!=removed){
                removedList.add(w);
            }
        }
        System.out.println(removedList);
    }
}

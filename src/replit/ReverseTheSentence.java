package replit;

import java.util.Scanner;

public class ReverseTheSentence {
    /*
    Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.

Note: Upper and lower case letters, spaces and special characters will not be changed.

Input :

It is very nice to write code.

Output :

.edoc etirw ot ecin yrev si tI
     */
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String arr[]=scan.nextLine().split("");
        System.out.println(reverseTheElement(arr));
    }
    public static String reverseTheElement(String arr[]){
        String reversed="";
        for (int i =arr.length-1; i >-1 ; i--) {
            reversed=reversed+arr[i];
        }
        return reversed;
    }
}

package day16arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {
        /*
1)Get string from user and type code to find the number of words in a String.
2)Count how many words starts with "a".(Make code case-sensitive)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a String");
        String str=scan.nextLine();
        String part1[]=str.split(" ");
        System.out.println(Arrays.toString(part1));
        System.out.println("The number of word in the given string is: "+part1.length);

        int counter=0;
        for (String w:part1) {
        if(w.startsWith("a")) {
            counter++;
        }
        }
        System.out.println("The number of word which start with 'a'is : "+counter);

    }
}

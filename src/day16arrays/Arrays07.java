package day16arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays07 {
    public static void main(String[] args) {
        // Find the longest word in a String

        String s = "Ali Can went to school to learn";
        String part1[]=s.split(" ");
        System.out.println(Arrays.toString(part1));
        Arrays.sort(part1, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(part1));
        System.out.println("The longest word is: "+part1[part1.length-1]);
        System.out.println("The shortest word is: "+part1[0]);




    }
}

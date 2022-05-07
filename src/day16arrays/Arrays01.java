package day16arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*
        put each word to an array as an element
         */
    String words="I go to school";
    String part1[]=words.split(" ");
        System.out.println(Arrays.toString(part1));

    String name="Sevval#Mustafa#Suat#Fatmanur";
    String part2[]=name.split("#");
        System.out.println(Arrays.toString(part2));
        String sentence="Learn Java earn money";
        String part3[]=sentence.split(" ");
        System.out.println(Arrays.toString(part3));

        String sas="I go to school and I talk to friends and I talk to teachers";
        String part4[]=sas.split("and");
        System.out.println(Arrays.toString(part4));
    }
}

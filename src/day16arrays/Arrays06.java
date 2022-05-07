package day16arrays;

import java.util.Arrays;

public class Arrays06 {
    public static void main(String[] args) {
        /*
        print the word ending with 'y'
        make the code case-insensitive
         */
String t="Learn Java, earn money.";
t=t.replaceAll("\\p{Punct}","");
String part1[]=t.split(" ");
        System.out.println(Arrays.toString(part1));
        for (String w:part1) {
          if(w.endsWith("y")||w.endsWith("Y")){
              System.out.println(w+" ");
          }
        }



    }
}

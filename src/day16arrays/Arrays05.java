package day16arrays;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        //find the vowels in a String by using arrays
        //print them on the console
        String s="Learn java, earn money";
        String part1[]=s.split("");
        System.out.println(Arrays.toString(part1));
        int counter=0;
        for(String w:part1){
          if(w.equalsIgnoreCase("a")||w.equalsIgnoreCase("e")||
          w.equalsIgnoreCase("i")||w.equalsIgnoreCase("o")
          ||w.equalsIgnoreCase("u")){
              System.out.print(w+" ");
              counter++;
          }
        }
        System.out.println();
        System.out.println("The number of vowels in the string is: "+counter);



    }
}

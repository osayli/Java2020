package day15arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        sort the elements according to their length
        ==>"Ali","Veli","Maria","Micheal"
         */
        String srr[]={"Veli","Micheal","Maria","Ali"};
        System.out.println(Arrays.toString(srr));
        Arrays.sort(srr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(srr));

        //sort the elements according to their length in descending order
        String trr[]={"Veli","Micheal","Maria","Ali"};
        Arrays.sort(trr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(trr));

        //sort the elements according to their length in descending order
        //if some elements are the same length, put them in alphabetic order
        String urr[]={"Veli","Can","Micheal","Maria","Ali","Ayse","Tan"};
        Arrays.sort(urr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(urr));
    }
}

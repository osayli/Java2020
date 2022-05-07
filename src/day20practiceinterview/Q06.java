package day20practiceinterview;

import java.util.ArrayList;
import java.util.List;

public class Q06 {
    public static void main(String[] args) {
        /*
         * Create an integer list which has 5 elements
         * Update all elements by adding "*" on the right of every element
         */
  List<Integer> list1= new ArrayList<>();
        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        List<String> list2= new ArrayList<>();
        for (Integer w:list1) {
           list2.add(w+"*");
        }
        System.out.println(list1);
        System.out.println(list2);


    }
}

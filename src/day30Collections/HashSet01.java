package day30Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet01 {
    /*
    1)Set is a collection that is used for unique elements
    2)Hash is a technique to create unique codes for each data
    3)HashSet is fast in operation because they do not use any specific order for data
    4)HashSet accepts null as a element
    5)order of elements in HashSet is random
     */
    public static void main(String[] args) {

        HashSet<String> hs1=new HashSet<>();
        hs1.add("K");
        hs1.add("K");
        System.out.println(hs1);//[K]
        hs1.add(null);
        System.out.println(hs1);//[null, K]
        hs1.add(null);
        System.out.println(hs1);//[null, K]

        HashSet<String> hs2=new HashSet<>();
        hs2.add(null);
        hs2.add("K");
        System.out.println(hs2);//[null, K]

        System.out.println(hs1.equals(hs2));//true

        //Interview Question: Type a code to display ArrayList elements only once.
        List<Integer> l1=new ArrayList<>();
        l1.add(5);
        l1.add(5);
        l1.add(2);
        l1.add(3);
        l1.add(2);
        l1.add(3);
        l1.add(5);
        System.out.println(l1);//[5, 5, 2, 3, 2, 3, 5]

         HashSet<Integer>  hs3=new HashSet<>();
         hs3.addAll(l1);
        System.out.println(hs3);//[2, 3, 5]

        Set<String> hs4=new HashSet<>();
        hs4.add("A");
        hs4.add("B");
        hs4.add(null);
        hs4.add("A");
        System.out.println(hs4);//[null, A, B]
    }
}

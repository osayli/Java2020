package day30Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSet01 {
    /*
    1)E
     */

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(13);
        lhs.add(10);
        lhs.add(32);
        lhs.add(5);
        lhs.add(5);
        System.out.println(lhs);//[12, 13, 10, 32, 5]

        List<Integer> l= new ArrayList<>();
        l.add(5);
        l.add(3);
        l.add(2);
        l.add(5);
        l.add(2);
        l.add(3);
        System.out.println(l);//[5, 3, 2, 5, 2, 3]

        //interview question: Display all arraylist elements at once on the console
        LinkedHashSet<Integer> lhs2=new LinkedHashSet<>();
        lhs2.addAll(l);
        System.out.println(l);//[5, 3, 2, 5, 2, 3]
        System.out.println(lhs2);//[5, 3, 2]
        //2nd way
        LinkedHashSet<Integer> lhs3=new LinkedHashSet<>(l);
        System.out.println(lhs3);//[5, 3, 2]

        



    }
}

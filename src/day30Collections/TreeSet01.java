package day30Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

    /*
   1) TreeSet is similar to HashSet except that it  sorts the elements in the ascending order  while HashSet doesn’t maintain any order.
Note: HashSet is faster than TreeSet for the operations like add(), remove(), contains(), size() etc.
Note: TreeSet does not allow duplication
Note: If you want a sorted Set then it is better  to add elements to HashSet and then convert it to TreeSet rather than creating a TreeSet
and adding elements to it
     */

    public static void main(String[] args) {

       TreeSet<Integer> ts=new TreeSet<>();
        ts.add(35);
        ts.add(12);
        ts.add(58);
        ts.add(0);
        ts.add(-9);
        ts.add(2);
        ts.add(35);
        ts.add(12);
        System.out.println(ts);//[-9, 0, 2, 12, 35, 58]

        /*
        interview :how to store unique elements in natural order?
        Answer: we can use TreeSet
        but TreeSet is so slow. how can you mke it faster?
        first create HashSet  and put all elements in HashSet than convert it to TreeSet.
         */
        //1ST WAY
        Long t1=System.nanoTime();
        TreeSet<String> ts1=new TreeSet<>();
        ts1.add("K");
        ts1.add("Z");
        ts1.add("A");
        ts1.add("C");
        ts1.add("T");
        System.out.println(ts1);
        Long t2=System.nanoTime();
        //2nd Way
        Long t3=System.nanoTime();
        HashSet<String> hs1=new HashSet<>();
        hs1.add("K");
        hs1.add("Z");
        hs1.add("A");
        hs1.add("C");
        hs1.add("T");
        System.out.println(hs1);
        TreeSet<String> ts2=new TreeSet<>(hs1);
        System.out.println(ts2);
        Long t4=System.nanoTime();
        System.out.println(t2-t1);
        System.out.println(t4-t3);
    }
}

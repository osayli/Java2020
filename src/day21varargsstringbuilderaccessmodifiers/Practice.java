package day21varargsstringbuilderaccessmodifiers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice {

    public static void main(String[] args) {

        //find the smallest positive integer and greatest negative integer in a given integer list

        List<Integer> list1=new ArrayList<>();
        list1.add(-12);
        list1.add(18);
        list1.add(-5);
        list1.add(23);
        list1.add(-2);
        System.out.println(list1);//[-12, 18, -5, 23, -2]sort==>[-12,-5,-2,18,23]==min,max==loop
        //1st step:sort
        Collections.sort(list1);
        System.out.println(list1);//[-12, -5, -2, 18, 23]
        //Assign value
        int minPositive=list1.get(list1.size()-1);
        int maxNegative=list1.get(0);
        //loop
        for(Integer w:list1){
           if(w>=0){ minPositive=Math.min(minPositive,w);
           }
           if(w<0){
               maxNegative=Math.max(maxNegative,w);
           }
        }
        System.out.println(minPositive);//18
        System.out.println(maxNegative);//-2
    }
}

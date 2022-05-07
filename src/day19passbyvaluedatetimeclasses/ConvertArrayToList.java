package day19passbyvaluedatetimeclasses;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
/*
when we create a list from an array by using "asList()" method, the length will be fixed like arrays.
 */

        Integer arr[]={3,4,5,6};

        List<Integer> list=Arrays.asList(arr);
        System.out.println(list);
        //try to remove element from list==>exception
       // list.remove(1);
        //System.out.println(list);
       //try to remove element from list==>exception
       // list.add(3);
        //System.out.println(list);

        //try to clear the list
        //list.clear();
        //System.out.println(list);


    }
}

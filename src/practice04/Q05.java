package practice04;

import java.util.ArrayList;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {
        /*
         Task: Create an integer array with 5 elements
         Convert to a list
         Add 11, and 13 into the list, 11 will be at the beginning, 13 will be at index 3
         Increase the value of every element by 3
         Print the multiplication of the elements from index 2 to index 5
         */
        int arr[] = {4,5,6,8,9};

        List<Integer> list1=new ArrayList<Integer>();
        for (int w:arr) {
            list1.add(w);
        }
        System.out.println(list1);
        list1.add(0,11);
        list1.add(3,13);
        System.out.println(list1);
        for (int w=0;w<list1.size();w++) {
            list1.set(w,list1.get(w)+3);
        }
        System.out.println(list1);
        int mul=1;
        for(int i=2; i<6;i++) {
            mul=mul*list1.get(i);
        }
        System.out.println(mul);
    }
}

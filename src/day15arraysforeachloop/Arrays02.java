package day15arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

      /*
      check if the array elements are in natural order.
      "A","B","C"  ==>NATURAL ORDER
      "A","C","B"==>not natural order
       */
        //1. correct solution
        String srr[]={"Ayhan","Ceyhan","Beyhan"};
        System.out.println(Arrays.toString(srr));
        /*
        create new array and put the elements in to the new array.
        if you want to keep original array unchanged, transfer elements one by one
        by using for loop. You will have the same element in 2 different
        reserved area
         */
        String trr[]=new String[srr.length];
        for (int i = 0; i < srr.length; i++) {
            trr[i]=srr[i];
        }
        System.out.println(Arrays.toString(trr));
        Arrays.sort(trr);
        if(Arrays.equals(srr,trr)){
            System.out.println("**Natural order**");
        }else{
            System.out.println("**not natural order**");
        }
        //2. Solution
        String mrr[]={"Ayhan","Ceyhan","Beyhan"};
        System.out.println(Arrays.toString(mrr));
        //if you want to keep original array unchanged use copyOf() method
        //by using copyOf() you will have same elements in 2 different reserved area
        String nrr[]=Arrays.copyOf(mrr,3);
        Arrays.sort(nrr);
        if(Arrays.equals(mrr,nrr)){
            System.out.println("!!Natural order!!");
        }else{
            System.out.println("!!not natural order!!");
        }







        //WRONG SOLUTION

        String urr[]={"Ayhan","Ceyhan","Beyhan"};
        System.out.println(Arrays.toString(urr));
        /*
        if you assign an array into another array they will
        use same reserved area, do not forget this
         */
        String prr[]=urr;//java not create new String in Heap memory
        Arrays.sort(prr);
        if(Arrays.equals(urr,prr)){
            System.out.println("Natural order");
        }else{
            System.out.println("not natural order");
        }

    }
}

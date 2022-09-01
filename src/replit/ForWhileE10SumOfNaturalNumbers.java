package replit;

import java.util.ArrayList;
import java.util.List;

/*

Write a Program to find the sum of natural numbers from 1 to 100.

OUTPUT : Sum of Natural Numbers 5050

*/
public class ForWhileE10SumOfNaturalNumbers {
    public static void main(String[] args) {
        //1. way
        int sum=0;
        int limit=100;
        for (int i = 0; i <=limit ; i++) {
            sum+=i;
        }
        System.out.println("Sum of Natural Numbers "+sum);

        //2. way
        List<Integer> integerList=new ArrayList<>();
        for (int i = 1; i <=limit ; i++) {
            integerList.add(i);
        }
        //System.out.println(integerList);
        int sumOfNumber =integerList.stream().reduce(0,Integer::sum);
        System.out.println("Sum of Natural Numbers "+sumOfNumber);
    }
}

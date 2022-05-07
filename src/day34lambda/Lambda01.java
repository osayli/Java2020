package day34lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lambda01 {
    /*
	 1)Lambda is "functional programming"
	   We will focus on "what to do" instead of "how to do"
	 2)Until now we used "structured programming"
	 In "structured programming" most of the time we think "how to do?" not "what to do?"
	 3)Lambda is added in Java version 8.
	 4)"Functional programming"(Lambda) is used with Collections.
	 5)We cannot use "Functional programming"(Lambda) with maps,but we can convert Maps to Collection
	 by using entrySet() method.
	 */

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(131);
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(2);
        list.add(8);
        list.add(15);
        System.out.println(list);
        printElStructured(list);
        System.out.println();
        printElFunctional(list);
        System.out.println();
        printEvenElementsStructured(list);
        System.out.println();
        printEvenElementsFunctional(list);
        System.out.println();
        squareOddElement01(list);
        System.out.println();
        distinctOddElementCube(list);
        System.out.println();
        distinctOddElementCube02(list);
        System.out.println();
        maxValue01(list);
        maxValue02(list);
        maxValue03(list);
        minEvenValueGreaterThanSeven01(list);
        minEvenValueGreaterThanSeven02(list);
        minEvenValueGreaterThanSeven03(list);
        HalfOfDistinctElementsReversed(list);
        sumOfSquareOfEvenElement01(list);
        sumOfSquareOfEvenElement02(list);
        cubeOfEvenElements01(list);
        cubeOfEvenElements02(list);
    }
/*1)Create a method to print the list elements on the console in the same line with
 a space between consecutive elements(Structured)
 */
public static void printElStructured(List<Integer> list){
    for(Integer w:list){
        System.out.print(w+" ");
    }
}
/*1)Create a method to print the list elements on the console in the same line with
 a space between consecutive elements(Functional)
 */
public static void printElFunctional(List<Integer> list){
   list.
      forEach(t-> System.out.print(t+" "));
    }
    /*
    2)Create a method to print the even list elements on the console in the same line with
     a space between two consecutive elements.(Structured)
     */
    public static void printEvenElementsStructured(List<Integer> list){
        for(Integer w : list){
            if( w % 2 == 0){
                System.out.print(w + " ");
            }
        }
    }
    /*
    2)Create a method to print the even list elements on the console in the same line with
     a space between two consecutive elements.(Functional)
     */
    public static void printEvenElementsFunctional(List<Integer> list) {
        list.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }
     /*
3)Create a method to print the square of odd list elements on the console
 in the same line with a space between two consecutive elements.(Functional)
     */
public static void squareOddElement01(List<Integer> list){
    list.
       stream().
       filter(t->t%2!=0).
       map(t->t*t).
       forEach(t-> System.out.print(t+" "));
}
  /*
  4)Create a method to print the cube of distinct odd list elements on the console
  in the same line with a space between two consecutive elements.
   */
    //Lambda Expression
  public static void distinctOddElementCube(List<Integer> list) {
      list.
              stream().
              filter(t -> t % 2 != 0).
              distinct().
              map(t -> t * t * t).
              forEach(t -> System.out.print(t + " "));
  }
  /*
    4)Create a method to print the cube of distinct odd list elements on the console
    in the same line with a space between two consecutive elements.
   */
    //Method Reference
  public static void distinctOddElementCube02(List<Integer> list) {
      list.
              stream().
              filter(t -> t % 2 != 0).
              distinct().
              map(t -> t * t * t).
              forEach(Lambda01::print);
  }
    public static void print(int a){
        System.out.print(a+" ");
    }
  //5)Create a method to find the maximum value from the list elements
  //Lambda Expression
    public static void maxValue01(List<Integer> list){
        Integer max=list.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE,(t,u)->t>u ? t:u);
        System.out.println(max);
    }
    //5)Create a method to find the maximum value from the list elements
    //Lambda Expression
    public static void maxValue02(List<Integer> list){
        Integer max=list.
                stream().
                distinct().
                sorted().
                reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println(max);
    }
    //5)Create a method to find the maximum value from the list elements
    //Method Reference
    public static void maxValue03(List<Integer> list){
      Integer max=list.
              stream().
              distinct().
              reduce(Integer.MIN_VALUE,Math::max);//or Integer::max
        System.out.println(max);
    }
    /*
//6)Homework: Create a method to find the minimum value from the list elements(In 2 ways)
     */
/*
7)Create a method to find the minimum value which is greater than 7 and even from the list
//more than 7, even, min value
 */
    //Lambda Expression
    public static void minEvenValueGreaterThanSeven01(List<Integer> list) {
        Integer min = list.
                stream().distinct().
                filter(t -> (t > 7 && t % 2 == 0)).
                reduce(Integer.MAX_VALUE, (t, u) -> t > u ? u : t);
        System.out.println(min);
    }
    //Lambda Expression
    public static void minEvenValueGreaterThanSeven02(List<Integer> list) {
        Integer min = list.
                stream().distinct().
                filter(t -> (t > 7 && t % 2 == 0)).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println(min);
    }
    //Lambda Expression
    public static void minEvenValueGreaterThanSeven03(List<Integer> list) {
        Integer min = list.
                stream().
                distinct().
                filter(t -> (t > 7 && t % 2 == 0)).
                sorted().findFirst().get();
        System.out.println(min);
    }
    /*
    8)Create a method to find the half of the elements which are
    distinct and greater than 5 in reverse order in the list.
     */
    public static void HalfOfDistinctElementsReversed(List<Integer> list) {
        List<Double> result = list.
                stream().
                distinct().
                filter(t -> t > 5).
                map(t -> t / 2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(result);
    }
    //9)Create a method to calculate the sum of the squares of distinct even elements
    //Lambda Expression
    public static void sumOfSquareOfEvenElement01(List<Integer> list){
        Integer sum=list.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(0,(t,u)->t+u);
        System.out.println(sum);
    }
    //Method Reference
    public static void sumOfSquareOfEvenElement02(List<Integer> list){
       Integer sum=list.
                   stream().
                   distinct().
                   filter(t->t%2==0).
                   map(t->t*t).
                   reduce(0,Integer::sum);
        System.out.println(sum);
    }
    //10)Create a method to calculate the product of the cubes of distinct even elements
    //Lambda Expression
    public static void cubeOfEvenElements01(List<Integer> list){
       Integer product= list.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t*t).
                reduce(1,(t,u)->t*u);
        System.out.println(product);
    }
    //Method Reference
    public static void cubeOfEvenElements02(List<Integer> list){
        Optional<Integer> product= list.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t*t).
                reduce(Math::multiplyExact);
        System.out.println(product);
    }

}

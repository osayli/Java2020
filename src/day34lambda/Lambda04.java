package day34lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Lambda04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Ali");
        list.add("Mark");
        list.add("Amanda");
        list.add("Christopher");
        list.add("Jackson");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Benjamin");

        printUppercase01(list);
        System.out.println();
        //printUppercase02(list);
        //System.out.println(list);
        printWithLength(list);
        System.out.println();
        printWithLengthReversed(list);
        System.out.println();
        orderDistinctLastChar(list);
        System.out.println();
        orderLengthAndFirstChar(list);
        System.out.println();
       // removeIfLength(list);
        //System.out.println(list);
        removeIfLengthAnd0(list);
        System.out.println(checkLength(list));//true
        System.out.println(checkNotToStartWithX(list));
        System.out.println(checkAtLeastAnyMatch(list));


    }
   /*
     1) Create a method to print all list elements in uppercase
     in the same line with a space
    */
    public static void printUppercase01(List<String> list){

        list.
                stream().
                map(String::toUpperCase).
                forEach(Utilities::printInSameLineWithSpace);
    }
    /*
     2) Create a method to print all list in uppercase
     in the same line with a space
    */
   // public static void printUppercase02(List<String> list){
    //    list.replaceAll(String::toUpperCase);
     //   System.out.println(list);
   // }
/*
  2)Create a method to print the elements after ordering according to their lengths
 */
    public static void printWithLength(List<String> list){

     list.
             stream().
             sorted(Comparator.comparing(String::length)).
             forEach(Utilities::printInSameLineWithSpace);
    }
    /*
    3) Create a method to print the elements after ordering
     according to their lengths (In reverse order)
     */
    public static void printWithLengthReversed(List<String> list){

        list.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                forEach(Utilities::printInSameLineWithSpace);
    }
    /*
    4) Create a method to sort the distinct
     elements by using their last characters
     */
    public static void orderDistinctLastChar(List<String> list){

        list.
                stream().
                distinct().
                sorted(Comparator.comparing(Utilities::getLastChar)).
                forEach(Utilities::printInSameLineWithSpace);
    }
    /*
    5) Create a method to sort the elements according to their lengths
     then according to their first character
     */
    public static void orderLengthAndFirstChar(List<String> list){

        list.
                stream().
                sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).
                forEach(Utilities::printInSameLineWithSpace);
    }


  /*  *//*
     6) Remove the elements if the length of the element is greater than 5
     */
   /* public static void removeIfLength(List<String> list){

        list.removeIf(t->t.length()>5);
       System.out.println(list);
    }*/

    /*
    7)Remove the elements if the length is between 8 and 10 or
    ending with 'o' (8 and 10 inclusive)
     */
//    public static void removeIfLengthAnd0(List<String> list){
//
//        list.removeIf(t->(t.length()>=8&&t.length()<=10)||t.charAt(t.length()-1)=='o');
//        System.out.println(list);
//    }
    public static void removeIfLengthAnd0(List<String> list){
        Predicate<String> checkCondition=t->(t.length()>=8&&t.length()<=10)||t.endsWith("o");
        list.removeIf(checkCondition::test);
        System.out.println(list);
    }
   /*
    Create a method to check
    if the lengths of all elements are less than 12
    */
    public static boolean checkLength(List<String> list){

       return list.stream().allMatch(t->t.length()<12);
    }
    //Create a method to check if the initial of any element is not 'X'
    public static boolean checkNotToStartWithX(List<String> list){
        return list.stream().noneMatch(t->t.startsWith("X"));
    }

    //Create a method to check if at least one of the elements ending with “r”
    public static boolean checkAtLeastAnyMatch(List<String> list){
        return list.stream().anyMatch(t->t.endsWith("r"));
    }


}

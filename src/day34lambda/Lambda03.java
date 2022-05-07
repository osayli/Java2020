package day34lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lambda03 {

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
        printElements(list);
        System.out.println();
        printEvenElements(list);
        System.out.println();
        squareOddElement(list);
        System.out.println();
        distinctOddElementCube(list);
        System.out.println();
        maxValue (list);
        minValue(list);
        minEvenValueGreaterThanSeven( list);
        HalfOfDistinctElementsReversed(list);
        sumOfSquareOfEvenElement01(list);
        sumOfSquareOfEvenElement02(list);
        cubeOfEvenElements(list);
    }
//1)Create a method to print the list elements on the console in the same line with a space
    public static void printElements(List<Integer> list){
        list.
                stream().
                forEach(Utilities::printInSameLineWithSpace);
    }
    /*
    2)Create a method to print the even list elements on the console in the same line with
     a space between two consecutive elements.
     */
    public  static void  printEvenElements(List<Integer> list){
        list.
                 stream().
                filter(Utilities::checkToBeEven).
                forEach(Utilities::printInSameLineWithSpace);
    }
    /*
    3)Create a method to print the square of odd list elements on the console
    in the same line with a space between two consecutive elements.(Functional)
            */
    public static void squareOddElement(List<Integer> list){
        list.
                stream().
                filter(Utilities::checkToBeOdd).
                map(Utilities::squareOfEl).
                forEach(Utilities::printInSameLineWithSpace);
    }
    /*
  4)Create a method to print the cube of distinct odd list elements on the console
  in the same line with a space between two consecutive elements.
   */
    public static void distinctOddElementCube(List<Integer> list) {
        list.
                stream().
                filter(Utilities::checkToBeOdd).
                distinct().
                map(Utilities::cubeOfEl).
                forEach(Utilities::printInSameLineWithSpace);
    }
    //5)Create a method to find the maximum value from the list elements
    //Method Reference
    public static void maxValue(List<Integer> list){
        Integer max=list.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE,Math::max);//or Integer::max
        System.out.println(max);
    }
    //6)Create a method to find the minimum value from the list elements
    //Method Reference
    public static void minValue(List<Integer> list){
        Integer min=list.
                stream().
                distinct().
                reduce(Integer.MAX_VALUE,Math::min);//or Integer::min
        System.out.println(min);
    }
/*
7)Create a method to find the minimum value which is greater than 7 and even from the list
//more than 7, even, min value
 */
//Method Reference
public static void minEvenValueGreaterThanSeven(List<Integer> list) {
    Integer min = list.
            stream().distinct().
            filter(t -> t > 7 ).filter(Utilities::checkToBeEven).
            sorted(Comparator.reverseOrder()).
            reduce(Integer.MAX_VALUE, Math::min);
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
    //Method Reference
    public static void sumOfSquareOfEvenElement01(List<Integer> list){
        Integer sum=list.
                stream().
                distinct().
                filter(Utilities::checkToBeEven).
                map(Utilities::squareOfEl).
                reduce(0,Integer::sum);
        System.out.println(sum);
    }
    //Method Reference
    public static void sumOfSquareOfEvenElement02(List<Integer> list){
        Integer sum=list.
                stream().
                distinct().
                filter(Utilities::checkToBeEven).
                map(Utilities::squareOfEl).
                reduce(0,Math::addExact);
        System.out.println(sum);
    }
    //10)Create a method to calculate the product of the cubes of distinct even elements
    //Method Reference
    public static void cubeOfEvenElements(List<Integer> list){
        Optional<Integer> product= list.
                stream().
                distinct().
                filter(Utilities::checkToBeEven).
                map(Utilities::cubeOfEl).
                reduce(Math::multiplyExact);
        System.out.println(product);
    }


}

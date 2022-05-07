package day34lambda;
import java.util.ArrayList;
import java.util.List;

public class Lambda02 {
    /*
    1)In functional programming we can use Lambda Expression it is allowed,
    but it is not recommended.Instead of Lambda Expression, we prefer to use Method Reference
    2)When we use method reference we have "Class Name::method name" Be careful
    about() we do not need it.
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
        printElements01(list);
        printElements02(list);
        System.out.println();
        printElements03(list);
        System.out.println();
        printElements04(list);
        printElementsWithStar01(list);
        System.out.println("===============");
        printElementsWithStar02(list);

    }
    /*1)Create a method to print the list elements on the console in the same line with
   a space between consecutive elements(Structured)
     */
    //Method Reference
    public static void printElements01(List<Integer> list){
        list.
                stream().
                forEach(System.out::println);
    }
    //Method Reference
    public static void printElements02(List<Integer> list){
        list.
                stream().
                forEach(System.out::print);
    }
    //Method Reference which we created
    public static void printElements03(List<Integer> list){
        list.
                stream().
                forEach(Lambda01::print);
    }
    //Method Reference which we created
    public static void printElements04(List<Integer> list){
        list.
                stream().
                forEach(Utilities::printInSameLineWithSpace);
    }

    //Create a method to print all elements on a separate line with a star
    public static void printElementsWithStar01(List<Integer> list){
        list.
                stream().
                forEach(t->System.out.println(t+"*"));
    }
    public static void printElementsWithStar02(List<Integer> list){
        list.
                stream().
                forEach(Utilities::printElementWithStar);
    }
}

package day06nestedifturneryswitch;

public class Ternary03 {
    public static void main(String[] args) {
        /*
        You have two integer
         if the both of the integers are positive do multiplication
         If one is negative one is positive return I do not know how to multiply
         */

    int a=12;
    int b =5;
    /*Note: If your ternary returns different types of data;
     do not  create reserved area for result,  put it directly inside System.out.println()

     */

        System.out.println(a>0 && b>0 ? a*b:"I do not know how to multiply");

    }
}

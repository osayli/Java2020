package day07stringmanipulations;

public class Sm02 {
    public static void main(String[] args) {
        //concat() method
        String str="Ali Can";
        String newstr=str.concat("!...").concat("Congrats....");
        System.out.println(newstr);
        // you can do concatenation by using + sign you can use also concat()
        //endWith() method

        System.out.println(str.endsWith("n"));// true
        System.out.println(str.endsWith("Can"));// true
        System.out.println(str.endsWith("N"));// false

        //startWith() method
        System.out.println(str.startsWith("A"));//true
        System.out.println(str.startsWith("Al"));//true
        System.out.println(str.startsWith("a"));//false
        System.out.println(str.startsWith("C",4));//true
        System.out.println(str.startsWith("i",5));//false

        /*
        11)concat()
        12)endsWith()
        13)startsWith(with 1 parameter)
        14)startsWith/with 2 parameters)

         */


    }
}

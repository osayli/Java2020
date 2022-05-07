package day20practiceinterview;

public class Q01 {
    public static void main(String[] args) {
        //Write a Java Program to swap two numbers
        int a =12;
        int b=10;
        System.out.println("a="+a);
        System.out.println("b="+b);
        //1st way
        int c=0;
        c=a;
        a=b;
        b=c;
        System.out.println("a="+a);
        System.out.println("b="+b);
        //2nd way
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}

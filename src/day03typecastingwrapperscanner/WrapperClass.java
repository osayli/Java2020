package day03typecastingwrapperscanner;

public class WrapperClass {
    public static void main(String[] args) {
        /* Java created new structure by putting some methods into primitive data types,
        that structure called as "Wrapper Classes"
         */

        /*
        1) Wrapper class contains primitive value and some methods which can be used by primitives
        2) How to name Wrapper Classes
        int==>Integer
        byte==>Byte
        short==>Short
        long==>Long
        float==>Float
        double==>Double
        char==>Character
        boolean==>Boolean
                */
        //3) Wrapper Classes are non-primitive, so they are stored in heap Memory
// How to convert primitive data to wrapper. It is called Autoboxing
char c='d';
Character wc=c;
// How to convert wrapper to primitive. It is called  Unboxing
        Short s=24;
        short ps=s;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MIN_VALUE+Short.MAX_VALUE);
    }
}

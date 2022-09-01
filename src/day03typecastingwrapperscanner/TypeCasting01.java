package day03typecastingwrapperscanner;

public class TypeCasting01 {
    public static void main(String[] args) {
        //byte<short<int<long<float<double
        //Type Casting: Converting small data type to larger one OR large data type to smaller one
        //is called as Type Casting.
        // 1)Auto Widening
        byte b=47;//44==>byte
        int a=b;  //47==>int
        System.out.println(a);
        //2) Explicit Narrowing
        double c=23.2;
        short d=(short)c;
        System.out.println(d);
        short e=258;
        byte f=(byte)e;//258(mod256)=2
        System.out.println(f);

    }







}

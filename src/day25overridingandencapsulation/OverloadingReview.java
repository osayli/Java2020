package day25overridingandencapsulation;

public class OverloadingReview {
    public static void main(String[] args){


    }
    //Can we overload static methods? YESSSS
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    //Can we overload final methods? YESSSS
    public final void multiply(int a, int b){
        System.out.println(a*b);
    }
    public final void multiply(int a, int b,int c){
        System.out.println(a*b*c);
    }
    //Can we overload private methods? YESSSS
    private void join(String a, String b){
        System.out.println(a+b);
    }
    private void join(String a, String b, String c){
        System.out.println(a+b+c);
}
}
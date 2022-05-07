package day12constructorsandmethodoverloading;

public class MethodOverloading01 {
    public static void main(String[] args) {

        //Method call
        System.out.println(add(12,5));
        subs(10,2);
        //if you have multiple methods whose name are same, Java look parameters to select method.
        System.out.println(add(12,12,23));
        System.out.println(add(2.5,1.5));
        System.out.println(add(3,4.2));
    }
    //if you use a method inside the main you should add static keyword between access modifier and the ruturn type.
   // Create add method which adds 2 integers
   public static int  add(int n1,int n2){
     return n1+n2;
   }
    // Create add method which adds 3 integers
   public static int add(int n1,int n2,int n3){
    return n1+n2+n3;
   }
    // Create add method which adds 2 double
   public static double add(double a,double b){
     return a+b;
   }
    // Create add method which adds  an integer and a double
   public static double add(int a,double b){
        return a+b;
   }
    // Create add method which adds a double and an integer
    public static double add(double a,int b){
        return a+b;
    }

   public static void subs(int a, int b){
       System.out.println(a-b);
   }
}
/*
if you have multiple methods with the same name in a class is called "method overloading"
 */
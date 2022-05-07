package day21varargsstringbuilderaccessmodifiers;

//var args =variable arguments
public class Varars01 {
    public static void main(String[] args) {
        add();//0
        add(5);//5
        add(5,10);//15
        add(5,10,15);//30

    }

    /*Varargs notes:
    1)You cannot use any other parameters after varargs.
    2)You can use any other parameters except varargs before varargs
    3)Varargs must be last parameter every time.
    4)You can use just a single varargs in a method parenthesis
     */

    /* How java varargs work?
The three dots (…) syntax tells the compiler that varargs has been used
and these arguments should be stored in the array.
 When we call a method with variable arguments,
 java compiler matches the arguments from left to right
 and creates an array of the remaining arguments when reaches to the last varargs parameter,
  and pass it to the method. The varargs parameter represents an array of the specified type.


   Note:
       varargs endless pit.
       There can be only one variable argument in a method.
       Variable argument (varargs) must be the last argument.
       Vararg methods can also be overloaded but it may lead to ambiguity.
   */

   public static void add(int... a){
     int sum=0;
     for(int w:a){
         sum=sum+w;
     }
       System.out.println(sum);
   }
}

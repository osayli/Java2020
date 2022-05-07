package day26exception;
/*
Java is easy to learn.
We are about to end Java Instruction.
OOP Concept has 4 principles;
1)Encapsulation
2)Inheritance
3)Polymorphism
4)Abstraction
 */


/*
1)Exception means unexpected issues in your code like "gas finishing" in your vacation.
There are 2 ways to work with Exceptions
  a)Exception Handling
  b)Throw Exception
 */
//!!!!! ArithmeticException!!!!
public class Exception01 {
    /*
    1)if you think any problem can occur for any line of code, put inside the
    try block and create a catch block.
    2)inside the catch block parenthesis put possible exception class
    3) by using "e.getMessage()"(just message) you can get the technical message
    4) if you want you can put a non-technical message inside the catch
    5) if the code inside the try body works without any issue, catch body will not be executed
****6)after any exception occurred next lines of codes cannot be executed.JAVA STOP EXECUTION

    */
    public static void main(String[] args) {
        divide(12,4);
        divide(0,5);
        divide(3,0);//no answer in Math
                         //Could not divide==>/ by zero
    }
  public static void divide(int a, int b){
     /*
     note:following code is not recommended because it needs math knowledge
     if(b==0){
          System.out.println("Divisor can not be zero");
      }else {
          System.out.println(a / b);
      }

      */
      try{
          System.out.println(a / b);
          System.out.println("Hiii");
          System.out.println("byeeee");
          System.out.println("===========");
      }catch(ArithmeticException e){
          System.out.println("Could not divide==>"+e.getMessage());
      }
  }
}

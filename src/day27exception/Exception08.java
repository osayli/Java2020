package day27exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
   /*
   1)When you use "throws" in the method name line, it means you are telling Java
   "Hey Java, if you need help let me now"

   2)after throws keyword in the method name line, you can use multiple exception classes
   like IOException,ArithmeticException,... but we cannot use parent child exception classes together

   3)what are the differences "throws" and "throw" keyword?
    a)"throws" can be used in method signature and "throw" can be used in method body.
    b)after "throws" we can use multiple exception class names but after "throw" you can use "new "keyword
    and the constructor of exception class
    c)"throws" keyword is used to handle "Checked Exception(CTE)" "throw" keyword is used to throw exception whenever and whatever we want

    4)What is the difference between "final", "finally" and "finalize" keyword?
    final variable: create constant variable
    final method :prevent method overriding
    final class: prevent inheritance
    finalize() method:is executed by Garbage Collector before the object is destroyed.
    finally :is used with try-catch block to provide statements that will always gets executed even if some exception arises,
    usually finally is used to close resources
   */
public class Exception08 {
    public static void main(String[] args) throws IOException {

        FileInputStream fsi = new FileInputStream("C:\\Users\\Acer\\IdeaProjects\\winter2022java\\src\\day27exception\\File01.txt");
        int k = 0;
        while ((k = fsi.read()) != -1) {
            System.out.print((char) k);
        }

        System.out.println();
        System.out.println("======================");
        printAge(12);//12
        printAge(-12);
    }
    // !!! custom Exception !!!!
    //create a method which throws "IllegalArgumentException" for negative age
public static void printAge(int age){
        if(age>0){
            System.out.println(age);
        }else{
           throw new IllegalArgumentException("Ages cannot be negative");
        }
}


}

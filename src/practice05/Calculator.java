package practice05;

public class Calculator {
/*
Create a basic calculator, create add, subtract, multiply, divide methods.
You can use varargs for addition and multiplication
Create a Runner class...
 */

 public  void add(double... d){

     double sum = 0;
     for(double w:d){
         sum=sum+w;
     }
     System.out.println("The sum is: "+sum);
}
    public  void multiply(double... d){

        double product = 1;
        for(double w:d){
            product=product*w;
        }
        System.out.println("The multiplication is: "+product);
    }
    public  void subtract(double a , double b){


        System.out.println("The difference is: "+(a-b));
    }
    public  void divide(double a , double b){
     if(b==0){
         System.out.println("You cannot divide to zero");
     }else{
        System.out.println("The subtraction is: "+(a/b));
     }
    }
}
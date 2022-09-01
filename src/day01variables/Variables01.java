package day01variables;

public class Variables01 {

    public static void main(String[] args) {
     // I am creating integer variable its name is age
      int age = 12;
      char initial='A';
      // Iam creating a char whose name is initial
        // Lets print the value of age and initial on the console
        System.out.println(age); // 12
        System.out.println(initial);
        // Create 3 integer values, assign values to them, print them on the console one by one
        int love=23, size= 43, weight=45;
        System.out.println(love);
        System.out.println(size);
        System.out.println(weight);
        //Print the sum of them
        System.out.println(love+size+weight);
        //Print the sum of them by the label at the beginning
        System.out.println("The sum is "+love+size+weight);// concatenation
        System.out.println("The sum is "+(love+size+weight));// summation
        int sum=love+size+weight;
        System.out.println("The sum is "+ sum);

        // Create 2 int and print their multiplication on the console with a label
        int a=21, b= 34;
        System.out.println("The Multiplication is " + a*b);
        /*
        Order of operation in math
        1 Do the operation inside the parenthesis
        2 Do multiplication and division
        3 Do addition and subtraction


         */

    }

}

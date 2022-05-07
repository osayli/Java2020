package oficehour01;

import java.util.Scanner;
/*
take the input from the user and tell whether the number is even or odd
 */
public class Q01 {
    public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
   System.out.println("Enter an integer");
   int num=in.nextInt();
   if(num%2==0){
       System.out.println("The given number is even");
   }else{
       System.out.println("The given number is odd");
   }
    }
}

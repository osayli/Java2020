package day04scannerifstatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
     //Ask user enter integer then check it is odd or even
        //Note1: "==" means equal, != means not equal
        //Note2: "!true" means false "!false" means true
     Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("Number is even");
        }
        if(num%2 !=0){
            System.out.println("Number is odd");
        }





    }
}

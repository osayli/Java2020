package practice01;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

/*
Type a program that ask user their age and gender.
If age is greater or equal than 18 and if gender is male, then print man ,
If age is greater or equal than 18 and if gender is female then print woman
If age is less than 18 and if gender is male then print boy ,
If age is less than 18 and if gender is female then print girl on the console.
      */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your gender");
        String gender=scan.next();
        gender=gender.toLowerCase();
        System.out.println("Please enter your age");
        int age= scan.nextInt();

        if(gender.equals("male")){
            if(age>=18){
                System.out.println("Man");
            }else if(age>=0){
                System.out.println("boy");
            }else{
                System.out.println("Please enter valid data");
            }
        }else if(gender.equals("female")){
            if(age>=18){
                System.out.println("Woman");
            }else if(age>=0){
                System.out.println("Girl");
            }else{
                System.out.println("Please enter valid data");
            }
        }else{
            System.out.println("Please enter valid data");
        }

    }
}

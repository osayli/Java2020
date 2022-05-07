package day05ifelsestatements;

import java.util.Scanner;

public class AgesAndStages {
    public static void main(String[] args) {
        //0 - 4 => baby
        //5 - 12 => child
      //13 - 20 => teenager
     //21 - 30 => adult
     //else (not expected age)

     Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        if(age>=0&&age<=4){
            System.out.println("Baby");
        }
        else if(age>=5&&age<=12){
            System.out.println("Child");
        }
        else if(age>=13&&age<=20){
            System.out.println("Teenager");
        }
        else if(age>=21&&age<=30){
            System.out.println("Adult");
        }
            else
                System.out.println("not expected age");
        }


    }

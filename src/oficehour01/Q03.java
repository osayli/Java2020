package oficehour01;

import java.util.Scanner;

/*
Take 3 input from the user and get the smallest number among them
 */
public class Q03 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1=in.nextDouble();
        System.out.println("Enter the second number");
        double num2=in.nextDouble();
        System.out.println("Enter the third number");
        double num3=in.nextDouble();

        //here we start building logic

        if(num1<num2&&num1<num3){
            System.out.println(num1+" is smallest than "+num2+"and "+num3);
        }else if(num2<num1&&num2<num3){
            System.out.println(num2+" is smallest than "+num1+"and "+num3);
        }else if(num3<num1&&num3<num2){
            System.out.println(num3+" is smallest than "+num1+"and "+num2);
        }
        else if(num1==num2||num1==num3||num2==num3){
            System.out.println("Numbers are same");
        }


    }
}

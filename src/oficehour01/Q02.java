package oficehour01;
import java.util.Scanner;
/*
take the input from the user and tell whether the number is positive, negative or zero.
 */
public class Q02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter an integer");
        int num=in.nextInt();
        if(num>0){
            System.out.println("The given number is positive");
        }else if(num<0){
            System.out.println("The given number is negative");
        }else{
            System.out.println("The given number is zero");
        }
    }
}

package tau;

import java.util.Scanner;

/*
OUR FİRST METHOD:
Write a method that asks a user for their name,
then greet them by name
 */
public class Ch5aGreetings {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        greetUser(name);
    }
    public static void greetUser(String name){

        System.out.println("Hi there, "+ name);
    }
}

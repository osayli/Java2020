package day06nestedifturneryswitch;

import java.util.Scanner;

public class NestedIfStatement01 {
    public static void main(String[] args) {

    /*
    Ask user to enter a password

		If the initial of the password is uppercase then check if it is ‘A’ or not.
		If it is ‘A’ the output will be “Valid Password”
		otherwise the output will be “Invalid Password”
		For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid

		If the initial of the password is lowercase then check if it is ‘z’ or not.
		If it is ‘z’ the output will be “Valid Password”
		otherwise the output will be “Invalid Password”
		For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
     */
Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Password");
        String pwd=scan.nextLine();
        //How to get first character from string
        char frst=pwd.charAt(0);//Index number in Java starts with 0
        /* Note:Nested if is not recommended:
        If it is possible do not use nested if because it has
        "time complexity" means takes too much time to execute
        */
        if(frst>='A'&& frst<='Z'){
            if(frst=='A'){
                System.out.println("Valid Password");
            }
            else{
                System.out.println("Invalid Password");
            }

        }else if(frst>='a'&& frst<='z'){
            if(frst=='z'){
                System.out.println("Valid Password");
            }
                else{
                    System.out.println("Invalid Password");
                }
           }
           else{
               System.out.println("Invalid Password because first character must be letter");

           }

scan.close();
    }
}

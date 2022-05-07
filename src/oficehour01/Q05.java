package oficehour01;

import java.util.Scanner;

/*
Take a character from the user and check whether this
 character is vowel or not. Also handle uppercase
 and lowercase of the character. And if the person
 does not type any character then give the error that
  please enter correct input
 */
public class Q05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a character");
        String input=in.nextLine().toLowerCase();
       //scenario for uppercase character
    boolean lowercase = input.charAt(0) >=97 && input.charAt(0) <= 122;
//scenario for lowercase character
    boolean uppercase = input.charAt(0) >=65 && input.charAt(0) <= 90;
    boolean vowel = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
        //if person didn't enter something and hits enter
        if(input.length() > 1){
            System.out.println("Sorry! Please don't take more than single character");
        }else if(!(uppercase || lowercase)){
            System.out.println("Sorry! Please only enter characters");
        }else if(vowel){
            System.out.println("This is a vowel");
        }else{
            System.out.println("This is not a vowel");
        }
    }
}
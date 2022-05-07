package day08stringmanipulations;

public class Sm02 {
    public static void main(String[] args) {
        //trim() method
     String fullName= "Ali Can";
        System.out.println(fullName);
     String fullNameTrimed=fullName.trim();
        System.out.println(fullNameTrimed);

        //isEmpty()
        //How can I understand if a string is empty or not?
        //1. way
        int numOfChar=fullName.length();
        if (numOfChar==0) {
            System.out.println("You did not  enter your name...");
        }else{
            System.out.println("You entered your name...");
        }
        //2. way
        boolean isEmpty=fullName.isEmpty();
        System.out.println(isEmpty);
        //This method returns false for just spaces "    "

        //isBlank() boolean
        boolean isBlank=fullName.isBlank();
        System.out.println(isBlank);
        //This method returns true for just spaces "    "



    }
}

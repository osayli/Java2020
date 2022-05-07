package oficehour01;

import java.util.Scanner;

/*
   Make a login System in Java. I've a choice to get logged in using my (username or email) and password.
    Credentials are following:

   Username: faizan123

   faizan@gmail.com

    admin123
    */
public class Q04 {
    public static void main(String[] args) {
       String userName="faizan123";
       String email="faizan@gmail.com";
       String password="admin123";
       Scanner in = new Scanner(System.in);
       System.out.println("Enter username or email: ");
       String username = in.nextLine();
       System.out.println("Enter Password: ");
       String password1 = in.nextLine();
        if((username.equals(userName) || username.equals(email)) && password1.equals(password)){
            System.out.println("Welcome! You are logged in");
        }else{
            System.out.println("Please enter the correct credentials");
        }

    }
}

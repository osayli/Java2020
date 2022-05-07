package day24objectmanupilation;

import java.util.Locale;
import java.util.Scanner;

public class Runner01 {
    /*
Type a program that asks user their name and lastname, then create an email for the user
concatenate the name and lastname then add @gmail.com
 */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName=scan.nextLine().toLowerCase().replaceAll(" ","");
        System.out.println("Please enter your last name");
        String lastName=scan.nextLine().toLowerCase().replace(" ","");
        mail(firstName,lastName);
        scan.close();
    }
    public static void mail(String a,String b){
        String mail= a+b+"@gmail.com";
        System.out.println(mail);
    }
}

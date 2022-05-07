package day24objectmanupilation;

import java.util.Scanner;

public class Runner03 {
         /*
Ask user their name and lastname
Then generate an email for them
concatenate  firstname and lastname
and "@gmail.com" then print email for the user on the console
 */
         public static void main(String[] args) {
             Scanner scan=new Scanner(System.in);
             System.out.println("Please enter your name and last name");

             Person person1=new Person(scan.nextLine(),scan.nextLine());
             System.out.println(person1.name);//osman
             System.out.println(person1.lastName);//sayli
             System.out.println(person1);//day24objectmanupilation.Person@5e9f23b4

             System.out.println(email(person1));//osmansayli@gmail.com
         }

         public static String email(Person person){
          String email=(person.name+person.lastName+"@gmail.com").replaceAll(" ","").toLowerCase();
             return email;
         }
}

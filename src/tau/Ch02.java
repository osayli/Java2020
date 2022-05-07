package tau;

import java.util.Scanner;

/*
Create a program that asks a user for a season of the year, then a whole number,
 then an adjective. And use the input to complete the sentence below.
 Output the result.
 "On a [adjective] [season of the year] day, I drink a minimum of
 [whole number] cups of coffee."

Good luck!
 */
public class Ch02 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a season of year");
        String season=input.next();
        System.out.println("Please enter an integer");
        int number=input.nextInt();
        System.out.println("Please enter an adjective");
        String adjective=input.next();

        input.close();

        System.out.println("On a "+ adjective+" "+ season+ " day, I drink a minimum of "+
                number+" cups of coffee.");

    }

}

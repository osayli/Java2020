package tau;

import java.util.Scanner;

/*
So, you're going to create a program that asks the user to enter the quantities for the following coins.

You'll ask them how many pennies would you like?
How many nickels would you like?
How many dimes?
And then, how many quarters?
What your program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.
Feel free to change this game for your country's currency, so if you don't use dollars and you use something else that's fine.

So, for an example of this let's say that I ask the user:

How many pennies? - And they said 0.
How many nickels? - 0
How many dimes? - 0
How many quarters? - 4
Then my program would know that, okay quarters are worth 25 cents. There's 4 of these, let me multiply those and get the value.
 Oh! that equals one dollar, so I let them know that they win. So that's an example of the game.

Good luck!
 */
public class Ch3fCalculateChanges {
    public static void main(String[] args) {

        System.out.println("how many pennies would you like?");
        Scanner scan=new Scanner(System.in);
        int pennies=scan.nextInt();
        System.out.println("how many nickels would you like?");
        int nickels=scan.nextInt();
        System.out.println("how many dimes would you like?");
        int dimes=scan.nextInt();
        System.out.println("how many quarters would you like?");
        int quarters=scan.nextInt();

        //calculate the count
        double count=pennies*0.01+nickels*0.05+dimes*0.10+quarters*0.25;
        double dollar=1;
        if(count==dollar){
            System.out.println("You win");
        }else if(count>dollar){
            System.out.println("it's more than one dollar and you went over:"+ (count-dollar));
        }else{
            System.out.println("it's less than one dollar and you went under:"+ (dollar-count));
        }

    }
}

package tau;

import java.util.Random;

/*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.

Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board.
 Here’s the code to do this ((import is java.util.Random):

Random random = new Random();
int die = random.nextInt(6) + 1;
After each roll, tell the user which game space they are on and how many more spaces they have to go to win.

Repeat this 4 additional times, for 5 rolls in total.

However, if the user gets to 20 before 5 rolls, end the game - they’ve won.

If they are greater than or less than 20 spaces exactly, they lose.

Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */
public class Ch4RollTheDime {
    public static void main(String[] args) {
        int numberOfDie=5;
        int numOfSpace=20;
        int place=0;

        for (int i = 0; i <numberOfDie ; i++) {
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            place=place+die;
            if(place>numOfSpace){
                System.out.println("You lost");
                break;
            }
            if(place==numOfSpace){
                System.out.println("Roll #"+(i+1)+": You've rolled a "+die+". You are now on space "+place+" and have "+ (numOfSpace-place)+" more to go.");
                System.out.println("You won");
                break;
            }
            System.out.println("Roll #"+(i+1)+": You've rolled a "+die+". You are now on space "+place+" and have "+ (numOfSpace-place)+" more to go.");

             }
        if(place<numOfSpace){
            System.out.println("You lost");

        }
    }
}

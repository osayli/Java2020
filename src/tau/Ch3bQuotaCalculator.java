package tau;

import java.util.Scanner;

/*
if-else:
All salespeople are expected to make at least 10 sales each week
For those who do, they receive a congratulatory message
For those who don't , they are informed of how many sales they were short
 */
public class Ch3bQuotaCalculator {

    public static void main(String[] args) {
        //initialize value we know
        int quota=10;
        //get unknown value
        System.out.println("How many sales did epmloyee make this week");
        Scanner scanner=new Scanner(System.in);
        int sales=scanner.nextInt();

        //make a decision on the path to take- output

        if(sales>=quota){
            System.out.println("Congrats! You've met this week:");
        }else{
            int salesShort=quota-sales;
            System.out.println("You did not make your qouta. You were  "+salesShort+" sales short");
        }
    }
}

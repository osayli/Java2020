package tau;

import java.util.Scanner;

/*
VARIABLE SCOPE:
Write an 'Instant credit check' program that approves anyone
who makes more than $25000 and has credit score of 700 or more
Reject all others
 */
public class Ch5bInstantCreditCheck {
    //initialize what we know
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //get what we do not know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //check if the user is qualified
        boolean qualified=isUserQualified(salary, creditScore);

        //Notify the user
       notifyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;

    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        if (creditScore >= requiredCreditScore && salary > requiredSalary) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You've been approved.");
        }else{
            System.out.println("Sorry, You've been declined.");
        }
    }
}

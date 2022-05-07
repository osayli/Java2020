package tau;

import java.util.Scanner;

public class Ch3eGradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade:");
        Scanner scan =new Scanner(System.in);
        char grade=scan.next().toUpperCase().charAt(0);

        String message;

        switch (grade){
            case 'A':
               message ="Excellent job";
               break;
            case 'B':
                message ="Great job";
                break;
            case 'C':
                message ="Good job";
                break;
            case 'D':
                message ="You need to work a bit harder";
                break;
            case 'F':
                message ="Uh oh!";
                break;
            default :
               message="Error. Invalid grade";

        }
        System.out.println(message);
    }
}

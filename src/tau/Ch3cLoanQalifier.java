package tau;

import java.util.Scanner;

public class Ch3cLoanQalifier {
    /*
    NESTED IF:
    to qualify for loan, a person must make at least $30000
    and have been working at their job for at least 2 years
     */

    public static void main(String[] args) {
        //initialize what we know
        int requiredSalary=30000;
        int requiredYearsEmployed=2;

        //get what we don't know
        System.out.println("Enter your salary");
        Scanner scan=new Scanner(System.in);
        double salary=scan.nextDouble();
        System.out.println("Enter the number of years with your current employer:");
        double years=scan.nextDouble();
        scan.close();
        //make decision

        if(salary>=requiredSalary){
            if(years>=requiredYearsEmployed) {
                System.out.println("Congrats! You qualify for the loan");
            }else{
                System.out.println("Sorry, You must have worked at " +
                        "your current job "+requiredYearsEmployed+ " years");
            }
        }else{
                    System.out.println("Sorry, You must  earn at least " + requiredSalary +
                            " to qualify for the loan");
                }
        }



    }

package tau;

import java.util.Scanner;

/*
if statement: all salesperson get a payment of $1000 a week.
Salespersons who exceed 10 sales get an additional bonus of $250.
 */
public class Ch3aSalaryCalculator {

    public static void main(String[] args) {

        //initialize known values
      int salary=1000;
      int bonus=250;
      int quota=10;

      //get values for the unknown
        System.out.println("How many sales did epmloyee make this week");
        Scanner in=new Scanner(System.in);
        int sales=in.nextInt();
        in.close();
        //quick detour for the bonus earners
      if(sales>quota){
          salary=salary+bonus;
      }
      //output
        System.out.println("The employee's pay is $"+salary);



    }
}

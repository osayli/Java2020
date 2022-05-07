package tau;

import java.util.Scanner;

/*
NESTED LOOP;
Find the average of each student's test score
 */
public class Ch4dAverageTestScores {
    public static void main(String[] args) {
        //initialize what we now
        int numberOfStudent=24;
        int numberOfTests=4;

        Scanner scanner=new Scanner(System.in);
        //process all students
        for (int i = 0; i < numberOfStudent; i++) {
            double total=0;
            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("Enter the test score for Test#"+(j+1));
                double score =scanner.nextDouble();
                total=total+score;
            }
            double average=total/numberOfTests;
            System.out.println("The test average for student #"+(i+1)+" is "+average);
        }
    }
}

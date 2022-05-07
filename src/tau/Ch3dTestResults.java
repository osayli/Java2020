package tau;

import java.util.Scanner;

/*

 */
public class Ch3dTestResults {

    public static void main(String[] args) {

        //get the test score
        System.out.println("Enter your test score:");
        Scanner in=new Scanner(System.in);
        double score=in.nextDouble();

        //determine the letter grade
        char grade;
        if(score<60){
            grade='F';
        }else if(score<70){
            grade='D';
        }else if(score<80){
            grade='C';
        }else if(score<90){
            grade ='B';
        }else{
            grade='A';
        }

        System.out.println(grade);

    }
}

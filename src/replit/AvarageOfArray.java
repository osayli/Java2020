package replit;

import java.util.Scanner;

public class AvarageOfArray {
    /*
    Write a java program that calculates the average value of array elements

input[]= {1,2,3,4,5,6,7}

Output : 4
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter an array length");
        int length=scan.nextInt();
        double arr[]=new double[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter "+i+". index element of array");
            arr[i]=scan.nextDouble();
        }
        double sum=0;
        double average=0;
        for(double w:arr){
            sum=sum+w;
        }
        average=average+sum/(arr.length);
        System.out.println(average);
    }
}

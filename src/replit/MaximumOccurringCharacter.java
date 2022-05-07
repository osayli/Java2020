package replit;

import java.util.*;

public class MaximumOccurringCharacter {
    /*
  Write a Java program to get a String from user as input
  and find the maximum occurring character in that string.(Ignore case sensitivity).
Input : Learning java is easy
Output: maximum occurring character is : a
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine().toLowerCase();
        List<String> ss = new ArrayList<>();
        String a = "";
        for (int i = 0; i < str.length(); i++) {
            a = str.substring(i, i + 1);
            if (a.equals(" ")) {
                continue;
            } else {
                ss.add(a);
            }
        }
            Collections.sort(ss);
        int counter =0;
        int treshold=Integer.MIN_VALUE;
        String max="";
        for(int i=1;i<ss.size();i++) {
            if(ss.get(i-1).equals(ss.get(i))) {
                counter++;
            }else {
                if(counter>treshold) {
                    treshold = counter;
                    max = ss.get(i - 1);
                }
                    System.out.println("The number of " + ss.get(i - 1) + " is:" + (counter + 1));
                    counter = 0;

            }
            if(i==ss.size()-1) {
                System.out.println("The number of "+ss.get(i)+" is:"+(counter+1));
            }
        }

            System.out.println(max);
        System.out.println(treshold);
        System.out.println(ss);


    }
}

package practice04;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

             /*
A list has elements "M", "K" and "P"
Ask user to enter a letter
If the letter exists in list convert it to "Got it"
otherwise add it to list
*/
List<String> list1= new ArrayList<>();
list1.add("M");
list1.add("K");
list1.add("P");
        System.out.println(list1);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a letter");
        String str=scan.next().substring(0,1).toUpperCase();
        if(list1.contains(str)){
            list1.set(list1.indexOf(str),"Got it");
        }else{
            list1.add(str);
        }
        System.out.println(list1);

    }
}

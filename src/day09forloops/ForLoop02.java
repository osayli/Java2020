package day09forloops;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
        //1. Example: Put * between 2 consecutive characters and to the end in the String
        //ex:Java==>J*a*v*a*
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=scan.nextLine();

        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+"*");
        }
        System.out.println();
        //2. Example: Type code to print unique chars in the string Ex: Hello==>heo
        // to be unique in a string means indexOf() and lastIndexOf methods returns the same value
        System.out.println("Enter a String");
        String u=scan.nextLine();
        for(int i=0;i<u.length();i++){
            if(u.lastIndexOf(u.charAt(i))==u.indexOf(u.charAt(i))){
                System.out.print(u.charAt(i));
                // 2. way
                //System.out.print(u.substring(i,i+1));

            }
        }
        System.out.println();
        //Note: fori for for loop shortcut
        //3. Example:Type a code to print given string reverse after removing spaces
        System.out.println("Enter a string");
        String d=scan.nextLine();
        d=d.replace(" ","");
        for (int i = 0; i < d.length(); i++) {
            System.out.print(d.charAt(d.length()-i-1));

        }

    }
}

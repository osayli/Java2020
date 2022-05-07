package day07stringmanipulations;

import java.util.Scanner;

public class Sm01 {
    public static void main(String[] args) {
     /*
      print the first and the last char of given string
      Java is easy==>Jy
      */

       Scanner scan=new Scanner(System.in);
        System.out.println( "Enter a String");
        String str=scan.nextLine();
        // 1. way: charAt()
        char firstChar=str.charAt(0);
        // to get last char in string charAt(str.length()-1)
        char lastChar=str.charAt(str.length()-1);
        System.out.println(firstChar+""+lastChar);
        System.out.println(""+firstChar+lastChar);
        // 2. way substring() method
        String k=str.substring(0,1)+str.substring(str.length()-1);
        System.out.println(k);
        /*
        2.Example : Type a code to get initials of first name and the last name of a give name.
        (please enter just first and last name)
        //Ali Can ==> AC, Mary Star ==MS
         */
        System.out.println("Enter your first and last name");
        String name=scan.nextLine();
        String initials=name.substring(0,1)+name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2);
        System.out.println(initials);
        //3.Example: Check if any character exists in a String or not
        //1. way
        int ind=name.indexOf("a");
        if(ind==-1){
            System.out.println("The character does not exist in string");
        }else{
            System.out.println("The character exists in string");
        }
        // 2. way
        boolean isContain=name.contains("a");
        if(!isContain){
            System.out.println("The character does not exist in string");
        }else{
            System.out.println("The character exists in string");
        }
        /*
The methods we learned so far:
1) equals()
2)equalsIgnoreCase()
3)length()
4)toUpperCase
5)toLowerCase
6)contains
7)charAt()
8)indexOf
9)substring(with 1 index)
10)substring(with 2 indexes)

 */





    }
}

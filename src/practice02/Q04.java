package practice02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
      /*
Ask user to enter a name and a character,
      then check how many times the character is repeated
      in the name by using for loop(make code case-sensitive)
     Example:
     INPUT      :char ch1= 'a' ;
                 String name ="John came late";
     OUTPUT :  a is repeated 2 times in this String
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a name");
        String name=scan.nextLine();
        System.out.println("Enter a character, if you enter " +
                "more than one character, I can check just check first ...");
        int num=0;
        char c=scan.next().charAt(0);
        for (int i = 0; i < name.length(); i++) {
         if(name.charAt(i)==c){
          num++;
         }
        }
        System.out.println(c+" is repeated "+num+ " times in the String");
        scan.close();
    }
}

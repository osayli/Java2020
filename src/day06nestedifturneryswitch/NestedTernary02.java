package day06nestedifturneryswitch;

import java.util.Scanner;

public class NestedTernary02 {
    public static void main(String[] args) {
      /*
      Type code to check the password
      If it has more 8 character, initial should be 'i'
      ıf it has no more  then 8 character initial should be 'K'
       */

     String pwd="Ka1b3c7cy";
     //length method return of number of char in String
        //For ex "Ali Can".length==>7
     String isValid=pwd.length()>8 ? (pwd.charAt(0)=='i' ? "Valid Password":"Invalid" +
             " Password") :(pwd.charAt(0)=='K' ? "Valid Password":"Invalid Password");
        System.out.println(isValid);
    }
}

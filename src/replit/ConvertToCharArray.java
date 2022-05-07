package replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertToCharArray {
        /*
        Create a custom return type method accepts a name as parameter and prints the name as a char array.

    (do not use toCharArray() method)

    Input : John

    Output :[J, o, h, n]
         */
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a String");
            String str=scan.nextLine();
            List<Character> list1=new ArrayList<>();
            for(int i=0;i<str.length();i++ ){
                if(str.charAt(i)!=' ') {
                    list1.add(str.charAt(i));
                }
            }

            System.out.println(list1);
        }
    }


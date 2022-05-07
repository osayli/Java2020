package practice08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01 {
    /*
   Create a list by getting the list elements from user
   If there is duplicated elements remove them from the list(you can use sets)
   Note: Give a message to the user as "Enter list elements, to stop entrance press '*'"
*/

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        List<String> list=new ArrayList<>();

        do{
            System.out.println("Enter list elements, to stop entrance press '*'");
            String str=scan.nextLine();
            if(str.equals("*")){
                break;
            }
            if(list.contains(str)){
                continue;

            }else{
                list.add(str);
            }

        }while(true);
        System.out.println(list);


    }
}

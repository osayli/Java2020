package day18arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
        /*
Ask user to enter a letter
If the letter exists in the list convert it to "Got it"
otherwise, add the element user entered into the list
*/
        ArrayList<String> list = new ArrayList<>();
        list.add("J");
        list.add("A");
        list.add("V");
        list.add("A");
     Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a letter");
        String nl=scan.next().toUpperCase();
        if(list.contains(nl)){
            list.set(list.indexOf(nl),"Got it!");
            System.out.println(list);
        }else{
         list.add(nl);
            System.out.println(list);
        }

     scan.close();
    }

}

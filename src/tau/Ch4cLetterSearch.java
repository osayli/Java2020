package tau;

import java.util.Scanner;

/*
loop break:
Search a String to determine if it contains the letter 'A'
 */
public class Ch4cLetterSearch {
    public static void main(String[] args) {
       //get text
        System.out.println("Enter some text:");
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine().toUpperCase();
        scanner.close();
        char ch='A';
        boolean letterFaund=false;

        for (int i = 0; i < text.length(); i++) {
            char currentLetter=text.charAt(i);
            if(currentLetter==ch){
                letterFaund=true;
                break;
            }

        }
         if(letterFaund){
             System.out.println("The text contains "+ch );
         }else{
             System.out.println("The text does not contain "+ch );
         }


    }
}

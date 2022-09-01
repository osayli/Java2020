package replit;

import java.nio.charset.StandardCharsets;
import java.util.Formatter;

public class ForWhileE08PrintAsciiValuesOfCharacters {
    public static void main(String[] args) {
        //1.way
        for (char i = 'a'; i <='z' ; i++) {
            System.out.println("Ascii value of " + i +" = "+ (int)i);

        }
        System.out.println("---------------------");
        //2. way
        for (char i = 'a'; i <='z' ; i++) {
            System.out.println("Ascii value of " + i +" = "+(int)i);
        }
        System.out.println("---------------------");
        //3. way
        for (char i = 'a'; i <='z' ; i++) {
            Formatter formatSpecifier = new Formatter();

            // Converting the character to integer and
            // ASCII value is stored in the format specifier
            formatSpecifier.format("%d", (int) i);

            // Print the corresponding ASCII value
            System.out.println("Ascii value of " + i + " = " + formatSpecifier);
        }
        System.out.println("---------------------");
            //4. way
        String[] str={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            for (String i:str) {

                // Character is initiated as a string

                // An array of byte type is created
                // by using getBytes method
                byte[] bytes = i.getBytes(StandardCharsets.US_ASCII);

            /*This is the ASCII value of the character
            / present at the '0'th index of above string.*/

                // Printing the element at '0'th index
                // of array(bytes) using charAt() method
                System.out.println("Ascii value of " + i.charAt(0) + " = "
                        + bytes[0]);
            }
    }
}

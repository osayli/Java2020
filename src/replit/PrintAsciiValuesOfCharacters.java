package replit;

import java.io.UnsupportedEncodingException;
import java.util.Formatter;

public class PrintAsciiValuesOfCharacters {
    public static void main(String[] args) {
        //1.way
        for (char i = 'a'; i <='z' ; i++) {
            int ascii=(int)i;
            System.out.println("Ascii value of " + i +" = "+ascii);

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
            try {

                // Character is initiated as a string

                // An array of byte type is created
                // by using getBytes method
                byte[] bytes = i.getBytes("US-ASCII");

            /*This is the ASCII value of the character
            / present at the '0'th index of above string.*/

                // Printing the element at '0'th index
                // of array(bytes) using charAt() method
                System.out.println("Ascii value of " + i.charAt(0) + " = "
                        + bytes[0]);
            }

            // Catch block to handle exception
            catch (UnsupportedEncodingException e) {

                // Message printed for exception
                System.out.println("OOPs!!!UnsupportedEncodingException occurs.");
            }
        }
        //2. way
        for (char i = 'a'; i <='z' ; i++) {
            System.out.println("Ascii value of " + i +" = "+(int)i);
        }
        System.out.println("---------------------");
    }
}

package practice_extra;

import java.util.Arrays;
/*
 * create a method accepts a name as parameter
 * and prints the name as a char array
 *
 * (do not use toCharArray() method)
 *
 * Input : John
 * Output : [J, o, h, n]
 */
public class Q03 {
    public static void main(String[] args) {

        charArray("John");
    }
    public static void  charArray(String str){
        char array[]=new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
         array[i]=str.charAt(i);
        }
            System.out.println(Arrays.toString(array));

    }
}

package replit;
import java.util.*;

public class RepeatedCharsInString {
    public static void main(String[] args) {
    //getting input from user
    Scanner scanner=new Scanner(System.in);
    System.out.println("Please enter any text");
    String text=scanner.nextLine().toLowerCase().replace(" ","");

    //find repeated chars with list and for loop
    List<Character> repeated=new ArrayList<>();
    for(int i=0; i<text.length();i++){
        for(int j=i+1; j<text.length();j++){
            if(text.charAt(i)==text.charAt(j)){
                if(!repeated.contains(text.charAt(i)))
                    repeated.add(text.charAt(i));
                break;
            }
        }
    }
System.out.println(repeated);


    //find repeated chars with Set and for loop
    HashSet<Character> repeated2=new HashSet<>();
    for(int i=0; i<text.length();i++){
        for(int j=i+1;j<text.length();j++){
            if(text.charAt(i)==text.charAt(j)){
                repeated2.add(text.charAt(i));
                break;
            }
        }
    }
  System.out.println(repeated2);


    //using method, Set and for each loop
    duplicatesInString(text);
        }
    public static void duplicatesInString(String str) {
        char[] cArray = str.toCharArray();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : cArray) {
            if (!set1.add(c)) {
                set2.add(c);
            }
        }
        set2.remove(' ');
        System.out.println(set2);
    }

}

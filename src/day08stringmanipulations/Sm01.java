package day08stringmanipulations;

public class Sm01 {
    public static void main(String[] args) {
       // 1. Example: Remove all space from the String
        String str="Ali! is 13 years old, I think he is 16.";
        String noSpace=str.replace(" ","");
        System.out.println(noSpace);
        System.out.println(str.replace('a','b'));
        //2. Example: Change digit to *.
        System.out.println(str.replace("13","**").replace("15","**"));
        /*
        Note:if you type code which runs just specific data it is called "Hard Coding".
        "Hard Coding" is not acceptable. İt is not dynamic.
         */
        /*
        Regex=Regular Expression. Exm:POSITIVE:"[0 9]", "[A Z]","[a z]","[0-9 a-z A-Z]"
                                      NEGATIVE:"[^0-9]","[^A-Z]","[^a-z]","[^A-Za-z]"
         */
       String noDigitDynamic=str.replaceAll("[0-9]","*");
        System.out.println(noDigitDynamic);

        //3. Example: Change all letter to "!"
        String noLetter=str.replaceAll("[A-Z a-z]","!");
        System.out.println(noLetter);
        // 4. Example:Change all character different from letters to "?"
        String allLetter=str.replaceAll("[^A-Za-z]","?");
        System.out.println(allLetter);
        //5.Example:Change all characters different from digits to"*"
        String chstr=str.replaceAll("[^0-9]","*");
        System.out.println(chstr);
        //6. Example: Change all chars different from space to "*"
        //1. way
        String noSpac=str.replaceAll("[^ ]","*");
        System.out.println(noSpac);
        //2. way
        System.out.println(str.replaceAll("\\S","*"));
        /*
        There are another structure for regular expressions
        1)\\s means space character
        2)\\S means characters different then space
        3)\\d means digit
        4)\\D means different then digit
        5)\\w means A-Z a-z 0-9 and -
        6)\\W means different then A-Z a-z 0-9 and _(underscore)
        7)\\p{Punct} means all punctuation marks
        8)\\P{Punct} means different from all punctuation marks
        9)\\A means beginning of the String
        9)\\Z means ending  of the String
         */
        //7. Example: How many chars are used in String different from space.
        System.out.println(str.replaceAll("\\s","").length());

        //8. Example: How many digits are used in the string?
        System.out.println(str.replaceAll("\\D","").length());
        //9. Example: How many letters are used in the string
        System.out.println(str.replaceAll("[^a-zA-Z]","").length());
        //10. Example: How many punctuation marks are used in the string?
        System.out.println(str.replaceAll("\\P{Punct}","").length());
        //2. way
        System.out.println(str.replaceAll("[^\\p{Punct}]","").length());
        //11. EXAMPLE :Put specific char at the beginnig
        System.out.println(str.replaceAll("\\A","*"));
       //12. EXAMPLE :Put specific char at the end
        System.out.println(str.replaceAll("\\Z","*"));
        //From Quiz
        //replace only A and l
        System.out.println(str.replaceAll("[Al]","*"));
        //replace only A to l
        System.out.println(str.replaceAll("[A-l]","*"));

    }
}

package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class InterviewQuestion {

    /*
            How to count the number of occurences of the words in a sentence
            For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
                          Java=3, is=1, easy=1, Type=1, ... , learn=2, ...
     */
    public static void main(String[] args) {

       /*
       Scanner scan=new Scanner(System.in);
       System.out.println("Please enter some text");
       String str=scan.nextLine();
        */
        String str="Java is easy. Type codes to learn Java. To earn money learn Java.";


        String words[]=str.replaceAll("\\p{Punct}","").split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer> result=new HashMap<>();

        for (String w:words) {
            Integer numOfOccurence=result.get(w);
            if(numOfOccurence==null){
               //if the word does not exist in the HashMap this part will be executed
                result.put(w,1);
            }else{
                //if the word exist in the map this will be executed
                result.put(w,numOfOccurence+1);
            }
        }
        System.out.println(result);

    }
}

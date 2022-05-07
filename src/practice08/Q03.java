package practice08;

import java.util.Arrays;
import java.util.HashMap;

public class Q03 {
    /*
How to count the number of occurrences of the letters(alphabetical characters) in a sentence
For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
            j=.., a=..,
            Make code case insensitive..
*/
    public static void main(String[] args) {

        String str="Java is easy. Type codes to learn Java. To earn money learn Java.";

        String arr[]=str.replaceAll("[^A-Za-z]","").toLowerCase().split("");
        System.out.println(Arrays.toString(arr));
        HashMap<String,Integer> hm1=new HashMap<>();
        for(String w:arr){
          if(!hm1.containsKey(w)){
              hm1.put(w,1);
          }else{
              hm1.put(w,hm1.get(w)+1);
          }
        }
        System.out.println(hm1);//{a=10, c=1, d=1, e=7, i=1, j=3, l=2, m=1, n=4, o=4, p=1, r=3, s=3, t=3, v=3, y=3}

    }
}

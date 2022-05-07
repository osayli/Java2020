package practice04;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {
        /*
        Task: Write code to find the sum of the dollars and sum of the euros in the given string
         */
        String s = "$1 $12 €34 €56 $45 €78";
        String arr[]=s.split(" ");
        System.out.println(Arrays.toString(arr));
        int sumDollar=0;
        int sumEuro=0;
        for (String w:arr) {
            if(w.contains("$")){
                sumDollar=sumDollar+Integer.valueOf(w.replace("$",""));
            }else{
                sumEuro=sumEuro+Integer.valueOf(w.replace("€",""));
            }
        }
        System.out.println("The sum of dollars: "+sumDollar);
        System.out.println("The sum of euros: "+sumEuro);



    }
}

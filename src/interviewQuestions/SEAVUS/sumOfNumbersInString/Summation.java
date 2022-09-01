package interviewQuestions.SEAVUS.sumOfNumbersInString;

import java.util.Arrays;

public class Summation {

    static long summy(String stringOfInts) {

        String[] arr =stringOfInts.split(" ");
        System.out.println(Arrays.toString(arr));
        if(arr.length==0){
            return 0;
        }

        long sum =0;
        for(String each:arr){
            sum+=Integer.parseInt(each);
        }
        return sum;
    }

    public static void main(String[] args) {
        long a=summy(" ");
        System.out.println(a);
    }
}

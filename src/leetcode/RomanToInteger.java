package leetcode;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println("Enter Roman numerical");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        System.out.println(romanToInt(s));
    }
    public static  int romanToInt(String s) {
        int result=0;

        for(int i=0;i<s.length();i++){

            if(i==s.length()-1){
                result=result+=value(s.charAt(i));
                continue;
            }

            if(value(s.charAt(i))<value(s.charAt(i+1))){
                result+=value(s.charAt(i+1)) -value(s.charAt(i));
                i++;
            }else{
                result+=value(s.charAt(i));
            }



        }
        return result;
    }

    public static int value(char c){
        int result=0;
        switch(c){
            case'I':
                result=1;
                break;
            case 'V':
                result=5;
                break;
            case 'X':
                result=10;
                break;
            case 'L':
                result=50;
                break;
            case 'C':
                result=100;
                break;
            case 'D':
                result=500;
                break;
            case 'M':
                result=1000;
                break;
        }
        return result;
    }
}



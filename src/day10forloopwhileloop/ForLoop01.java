package day10forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
        /*
        1. Example:Type code to find the sum of the integers from 12 to 231
         */
        int sum=0;
  for(int i= 12; i<232; i++){
      sum=sum+i;


  }
        System.out.println("The sum of the integers from 12 to 231 is:"+sum);

//2. Example:Type code to find the multiplication of the integers from 3 to 5
        int mul=1;
        for (int i = 3; i <6 ; i++) {
            mul=mul*i;
        }
        System.out.println("The multiplication of the integers from 3 to 5 is:"+mul);
        // !!!! interview Question !!!!!!
        //3)Type code to check if a given String is Palindrome.
        //  String: anna  Reversed String: anna
        //  Intgeger: 12321  Reversed Integer: 12321

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter any String");
        String s=scan.nextLine();
        String reverseds="";
        for (int i =s.length()-1; i >-1; i--) {
         reverseds=reverseds+s.charAt(i);
        }
        System.out.println(reverseds);
        if(s.equals(reverseds)){
            System.out.println("Palindrome");
    }else{
            System.out.println("Not Palindrome");

        }
        // !!!! interview Question !!!!!!
        //3)Type code to check if a given integer is Palindrome.
        //  Intgeger: 12321  Reversed Integer: 12321
        System.out.println("Please enter any integer");
        int num=scan.nextInt();
        String stringFromNum=String.valueOf(num);
        String reversednum="";
        for (int i =stringFromNum.length()-1; i >-1; i--) {
            reversednum=reversednum+stringFromNum.charAt(i);
        }
        System.out.println(reversednum);
        if(stringFromNum.equals(reversednum)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
            //Type code to find the sum of the digits of an integer
            System.out.println("Enter an integer");
            int a=scan.nextInt();
            int sumInt=0;
            if(a<0){
                a=-1*a;
            }
        for (int i = a; i >0 ; i=i/10) {
          sumInt=sumInt+i%10;
        }
        System.out.println(sumInt);

        //Type code to find the sum of the unique digits of an integer.
        System.out.println("Enter an integer");
        int ud=scan.nextInt();
        String sud=String.valueOf(ud);
        int sumud=0;
        for (int i = 0; i < sud.length(); i++) {
            String c=sud.substring(i,i+1);
            //char c=sud.charAt(i);
            if (sud.lastIndexOf(c)==sud.indexOf(c)) {
                sumud=sumud+Integer.valueOf(c);
                //sumud=sumud+Integer.valueOf(c+"");
                //sumud=sumud+Integer.valueOf(c);//if you put char inside valueof() you will get ASCII value 1. solution concatination with + "".
                // or use substring
            }

        }
        System.out.println(sumud);

        scan.close();
}
}
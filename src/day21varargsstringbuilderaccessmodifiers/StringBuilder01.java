package day21varargsstringbuilderaccessmodifiers;

import jdk.swing.interop.SwingInterOpUtils;

public class StringBuilder01 {
    /*
    1)String Class  is immutable but StringBuilder  is mutable.
    2)immutable means updates will not be reflected to the original String without assignment
    3)mutable means updates will be reflected to the original String without assignment
    4)if you want to reclect updated directly to the original String, use StringBuilder otherwise, use String Class

     */
    public static void main(String[] args) {

        String s="Ali";

        System.out.println(s+"!");//Ali!

        System.out.println(s);////Ali
        //to update make assgnment
        s=s+"!";
        System.out.println(s);//Ali!
        //how to create StringBuilder

         //1st way
        StringBuilder sb1=new StringBuilder("Veli");
        System.out.println(sb1);//Veli
        System.out.println(sb1.length());//4
        System.out.println(sb1.capacity());//20
        sb1.append("!");
        System.out.println(sb1);//Veli!
        System.out.println(sb1.length());//5
        System.out.println(sb1.capacity());//20

        //Java gives 16 boxes for the characters whose numbers are less than 16.
        //2nd way
        StringBuilder sb2=new StringBuilder();
        System.out.println("For empty: "+sb2.capacity());//16
        System.out.println(sb2);//
        sb2.append("Deli");
        System.out.println(sb2);//Deli
        sb2.append(" Han").append("!...");
        System.out.println(sb2);//Deli Han!
        System.out.println(sb2.length());//12
        System.out.println("For non-empty : "+sb2.capacity());//16
        sb2.append("xxxxx");
        System.out.println(sb2);//Deli Han!...xxxxx
        System.out.println(sb2.length());//17
        ////Java gives 2 times existing boxes plus 2 if you use characters more than the existing boxes.
        System.out.println("For non-empty : "+sb2.capacity());//34

        //3rd way
        StringBuilder sb3=new StringBuilder(2);
        System.out.println(sb3.length());//0
        System.out.println(sb3.capacity());//2
        sb3.append("FL");
        System.out.println(sb3.length());//2
        System.out.println(sb3.capacity());//2
        sb3.append("!");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//2*2+2=6

        StringBuilder sb4=new StringBuilder("Mississippi");

        System.out.println(sb4.lastIndexOf("s"));//6
        //take the first  n indexes return the index of last  occurance of s(character)
        System.out.println(sb4.lastIndexOf("s",4));//3
        System.out.println(sb4.lastIndexOf("s",7));//6

        sb4.insert(2,"XXX");
        System.out.println(sb4);//MiXXXssissippi

        sb4.insert(1,"ABCDE",1,3);
        System.out.println(sb4);//MBCiXXXssissippi

        //delete
        sb4.delete(4,7);
        System.out.println(sb4);//MBCississippi
        //deleteAtCharAt
        sb4.deleteCharAt(1);
        System.out.println(sb4);//MCississippi
        sb4.deleteCharAt(1);
        System.out.println(sb4);//Mississippi

        //replace
        sb4.replace(2,4,"SS");
        System.out.println(sb4);//MiSSissippi

        //reverse
        sb4.reverse();
        System.out.println(sb4);//ippissiSSiM

        StringBuilder sb5=new StringBuilder("Ali Can");
        StringBuilder sb6=new StringBuilder("Ali Can");
        StringBuilder sb7=new StringBuilder("Bli Can");
        StringBuilder sb8=new StringBuilder("Dli Can");
        //for the same string compareTo method returns 0
        System.out.println(sb5.compareTo(sb6));//0
        //if the first one comes before the second one the result will be negative
        System.out.println(sb5.compareTo(sb7));//-1
        System.out.println(sb5.compareTo(sb8));//-3
        //if the first one comes after the second one the result will be positive
        System.out.println(sb7.compareTo(sb5));//1
        System.out.println(sb8.compareTo(sb5));//3
        //the number 3 means the difference lexicographically
        //for the uppercase and lowercase it will return the difference between ASCII values



        //if a method comes from String Class, it will be immutable, it means it cannot update the StringBuilder
        System.out.println(sb5.substring(3));// Can
        System.out.println(sb5);//Ali Can
        // you cannot make like that assignment:==> sb5=sb5.substring(3);
        String newString=sb5.substring(4);
        System.out.println(newString);//Can
        //can we convert StringBuilder to String==>yes by using toString()
        String stringFromStringBuilder=sb5.toString();
        System.out.println(stringFromStringBuilder);//Ali Can
        //can we convert String to StringBuilder? ==>yes by using StringBuilder constructor
        StringBuilder StringBuilderFromString=new StringBuilder(stringFromStringBuilder);






    }
}

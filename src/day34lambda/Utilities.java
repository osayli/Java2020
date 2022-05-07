package day34lambda;

public class Utilities {

    public static void printInSameLineWithSpace(Object obj){
    System.out.print(obj+" ");
}
    public static void printElementWithStar(Object obj){
        System.out.println(obj+"*");
    }
    public static boolean checkToBeEven(int a){
    return a%2==0;
    }
    public static boolean checkToBeOdd(int a){
        return a%2!=0;
    }
    public static int squareOfEl(int a){
        return a*a;
    }
    public static int cubeOfEl(int a){
        return a*a*a;
    }
    public static char getLastChar(String str){
        return str.charAt(str.length()-1);
    }
}
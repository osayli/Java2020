package day19passbyvaluedatetimeclasses;

public class PassByValue {
    /*
    1)when we use a variable inside method, Java create a copy of the variable and uses the copy inside the method. Because
    Java wants to protect the original value of variable. This process called as "Pas by Value" in Java.
    2)Java uses Pas by Value all the time
    3)The opposite of Pas by Value is "Pass by Reference" Java does not use  Pass By Reference. The programming languages, use Pass by Reference,
    do not protect the original value
     */

    public static void main(String[] args) {

      int shirt=100;
      int veteranShirt=veteransDiscount(shirt);
        System.out.println(veteranShirt);//80

        int seniorShirt=seniorDiscount(shirt);
        System.out.println(seniorShirt);//90
        int studentShirt=studentDiscount(shirt);
        System.out.println(studentShirt);//95

        System.out.println(shirt);//100

    }
    public static int veteransDiscount(int shirt){
       return shirt-20;
    }
    public static int seniorDiscount(int shirt){
        return shirt-10;
    }
    public static int studentDiscount(int shirt){
        return shirt-5;
    }
}

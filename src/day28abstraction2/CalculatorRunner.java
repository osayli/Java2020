package day28abstraction2;

public class CalculatorRunner {
    public static void main(String[] args) {

        Calculator p1=new Profit();
        System.out.println(p1.addition(2,3));//5
        System.out.println(p1.multiplication(2,3));//6
        System.out.println(p1.substraction(5,9));//-1
        System.out.println(p1.division(6,3));//-1

        System.out.println("=================");

        Calculator c1=new Loss();
        System.out.println(c1.addition(2,3));//-1
        System.out.println(c1.multiplication(2,3));//-1
        System.out.println(c1.substraction(5,3));//2
        System.out.println(c1.division(9,3));//3
        System.out.println(c1.division(1,0));

    }
}

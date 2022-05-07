package day28abstraction;

public class CarRunner {
    public static void main(String[] args) {
      //we cannot create object from abstract class
      // Car c1=new Car();
    //  data type    constructor
        Car t1=new Toyota();
        //note:children can use data type of its parents
        t1.make();//My car is: Toyota
        t1.model();//My car is a: Camry
        t1.year();//My car year is: 2022
        //we use here: inheritance,polymorphism and abstraction
        System.out.println("=============================");
        Car h1=new Honda();

        h1.make();//My car is: Honda
        h1.model();//My car is a: Accord
        h1.year();//My car year is: 2022
    }
}

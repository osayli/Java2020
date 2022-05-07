package day22inheritance;

public class Dog extends Mammal{

    public Dog(){
        System.out.println("Dog Constructor");
    }

    /*
    the class name before the "extends" keyword is child class, and the class name after "extends" keyword is parent class
     */
    public void bark(){
        System.out.println("Dogs bark...");
    }
}

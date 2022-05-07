package day12constructorsandmethodoverloading;
/*
1) Constructors are used to create objects from a class
2) Java puts default constructors inside every class
3)Default constructors do not have any parameter inside the constructor parenthesis
(Default constructors are invisible)
4) Constructors names must match with class name
5)We can create multiple constructors in one class


//How to create a constructor
1)Type access modifier
2)Type the Class name as constructor
3)open-close parenthesis
4)open-close curly brace


Interview Question
What is the differences between "constructors" and "methods"?
1)Constructors do not have any return type but methods have.
2)Constructors name must be same with the class, methods can get any names with rules of Java.

 */


public class Car {
    String make;
    String model;
    double price;
    int year;
    //if we create any constructor Java remove default one.
    public Car(){

    }
    public Car(String make,String model,double price,int year){
        this.make=make;
        this.model=model;
        this.price=price;
        this.year=year;

    }
    public Car(String make,String model){
        this.make=make;
        this.model=model;

    }
    public static void main(String[] args) {


Car c1= new Car();
c1.make="Honda";
c1.model="Civic";
c1.price=30000;
c1.year=2020;

Car c2=new Car();
        c1.make="Mercedes";
        c1.model="AMG";
        c1.price=10000;
        c1.year=2016;
Car c3=new Car("BMW","M3",70000 ,2021);
        System.out.println(c3.make);
        System.out.println(c3.model);
        System.out.println(c3.price);
        System.out.println(c3.year);
Car c4 =new Car("Volvo","v60",10000,2000);
        System.out.println(c4.make);
        System.out.println(c4.model);
        System.out.println(c4.price);
        System.out.println(c4.year);
Car c5=new Car("toyota","Camry");
        System.out.println(c5.make);
        System.out.println(c5.model);
}

public String run(){
        return "I started to run";
}
}
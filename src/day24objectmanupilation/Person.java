package day24objectmanupilation;

import jdk.swing.interop.SwingInterOpUtils;

public class Person {

    String name;
    String lastName;

    public Person(){

    }
    public Person(String name,String lastName){
        this.name=name;
        this.lastName=lastName;
    }

    public static void main(String[] args) {

        Person person1=new Person();
        System.out.println(person1.name);//null
        System.out.println(person1.lastName);//null

        Person person2=new Person("Orcun","Kadioglu");
        System.out.println(person2.name);//Orcun
        System.out.println(person2.lastName);//Kadioglu
    }
}

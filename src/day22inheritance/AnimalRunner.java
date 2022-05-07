package day22inheritance;

public class AnimalRunner {
    /*
    1)to make a class child of another class we use "extends" keyword.

    2)we create parent-child relationship because of:
      a)to prevent repetition
      b)to make maintenance easy
      c)to make classes atomic (less code and faster)

    3)child classes can use methods of parent class but parent cannot use child classes' methods.
    Child classes can use their parent's public and protected methods and variables(class member)

    4)a child class can have parent class, grandparent class, grand grandparent class, etc...
      a parent class can have child class , grandchild class , etc....

    5)every class has a parent class except Object Class(like Adam and Eve). Object Class is parent of every class.

    6)Java support "multi-level inheritance", "Hierarchical inheritance" and "Single inheritance" but does not support "multiple inheritance"

    7) when you create an object in child class, all constructors in parent classes work from top the bottom
     */
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
        d1.drink();
        d1.bark();
        d1.feedBabyByMilk();
        System.out.println("===========");

        Cat c1=new Cat();
        c1.eat();
        c1.drink();
        c1.meow();
        c1.feedBabyByMilk();
        System.out.println("===========");

        Bird b1=new Bird();
        b1.eat();
        b1.drink();
        b1.tweet();
        System.out.println("===========");

        Mammal m1=new Mammal();
        m1.feedBabyByMilk();
        m1.eat();
        m1.drink();
        System.out.println("===========");

        Animal a1=new Animal();
        a1.eat();
        a1.drink();

    }
}

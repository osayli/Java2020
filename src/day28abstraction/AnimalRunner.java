package day28abstraction;
/*
1)differences between an abstract class and a concrete class
 a)abstract classes cannot generate any object,but we can create objects from concrete class
 b)Abstract classes can have abstract and concrete methods, but concrete classes can have just concrete methods

 2)sometimes we need methods without body (abstract method) we do not use the body of methods

 3)to create an abstract method 1)do not put method body
                                2)use "abstract" keyword between access modifier and return type
                                3)abstract methods can be created just in abstract classes
                                4)to make class abstract use use "abstract" keyword just after access modifier

 4)Abstract classes can have both abstract and concrete methods but concrete classes just can be concrete methods

 5)Abstract method MUST be overridden by all child CONCRETE classes but it is optinal for concrete methods
 if you want to make a functionality MUST for child classes use abstract method for the functionality

 6)An abstract class can have abstract child classes. it is not mandotory for abstract child classes to override abstract method

 7)abstract methods cannot be final. because they will have newly updated body in every child class
  but final means no update in the body

  8)abstract methods cannot be private. because we create abstract methods just for child class usage. (we do not have any body)
  if we make abstract method private child classes cannot access the methods.

  9)we cannot make abstract classes final and private.

 */
public class AnimalRunner {
    public static void main(String[] args) {

       Animal c1=new Cat("meow","Shero");
       c1.animalName();//Name of the animal is: Shero
       c1.animalSound();//Sound of the cat is: meow

        c1.drinkWater();
        System.out.println("===========================");


        Animal s1=new Sheep("meeee","Shaun");
        s1.animalName();//animal name is Shaun
        s1.animalSound();//Animal sound is meeee

        s1.drinkWater();

        System.out.println("==================");

        Sheep s2=new Sheep("baa","Dolly");
        s2.animalName();//animal name is Dolly
        s2.animalSound();//Animal sound is baa
        System.out.println(s2.name);//Dolly===>we can use name and sound instance variables because we create Sheep object by using sheep() constructor
        System.out.println(s2.sound);//baa

        s2.drinkWater();//Animals drink water

    }
}

package day25overridingandencapsulation;

public class Dog extends Mammal{
    @Override//This is annotation and it checks overriding rules.
    // if we put this,Java check overriding rules and warn you if you make mistake. and you get Compile Time Error
    public void eat() {
        System.out.println("Dogs eat");
    }

    public void bark() {
        System.out.println("Dogs bark");
    }

}

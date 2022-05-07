package day25overridingandencapsulation;

public class Mammal extends Animal{

    public void feedBabyWithMilk(){
        System.out.println("Mammal feed their babies with milk");
    }

    @Override
    public Mammal myMethod() {
        return new Mammal();
    }
}

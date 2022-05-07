package day22inheritance;

public class Mammal extends Animal{

    public Mammal(){
        System.out.println("Mammal Constructor");
    }

    public void feedBabyByMilk(){
        System.out.println("Mammals feed their baby by milk...");
    }
}

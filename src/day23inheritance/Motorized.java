package day23inheritance;

public class Motorized extends Vehicle{

    public Motorized(int capacity){
        super("Be careful");//we can write or not there is always super() in every constructor.
        System.out.println("Motorized constructor with parameter");
    }
}

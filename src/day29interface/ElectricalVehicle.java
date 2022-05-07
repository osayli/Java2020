package day29interface;

public abstract class ElectricalVehicle implements AirCondition{

    /*
    abstract class can have abstract methods and non-abstract methods so we can override and
     implement super class or interface methods in abstract class but this cannot be achieved in interface

     */

    @Override
    public void electronicAc() {
        System.out.println("Electrical vehicle AC...");
    }

    @Override
    public void bacteriaKiller() {
        System.out.println("Electrical vehicle bacteria killers..");
    }
}

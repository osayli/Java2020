package day29interface;

public class Tesla extends  ElectricalVehicle implements Vehicle{
    @Override
    public void climateAc() {
        System.out.println("Tesla AC represents..");
    }

    @Override
    public void run() {
        System.out.println("Tesla runs performance ");
    }

    @Override
    public void moveSmooth() {
        System.out.println("Tesla ");
    }
}

package day29interface;

public class Runner {
    public static void main(String[] args) {

        HybridEngine hybridEngine=new Car();

        hybridEngine.havingHybridEngine();//The car engine is hybrid
        System.out.println("===================");

        Car c1=new Car();
        c1.bacteriaKiller();//The car Ac kills 99% of the bacteria
        c1.climateAc();//The car AC is climate AC
        c1.electronicAc();//The car AC is electronic
        c1.run();//The car AC runs perfectly
        c1.havingHybridEngine();//The car engine is hybrid
        c1.moveSmooth();//The car moves smoothly
        c1.move();//All vehicles should move..
        c1.power();//Hybrid engines are increasing their power...
    }
}

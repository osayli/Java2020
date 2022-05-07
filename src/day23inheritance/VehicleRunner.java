package day23inheritance;

public class VehicleRunner {

    public static void main(String[] args) {

       Car c1=new Car("Honda");
       /*
       Vehicle constructor with String parameter
       Motorized constructor with parameter
       Car constructor with String parameter
        */
        System.out.println("====================================");
       Bus b1=new Bus(23);
       /*
       Vehicle constructor with String parameter
       Motorized constructor with parameter
       Bus constructor with integer parameter
        */
        System.out.println("====================================");
        Bicycle b2=new Bicycle("bianchi");
        /*
        Vehicle constructor without parameter
        Bicycle with String parameter
         */
        System.out.println("====================================");
        Motorized m1=new Motorized(12);
        /*
        Vehicle constructor with String parameter
        Motorized constructor with parameter
         */
        System.out.println("====================================");
        Vehicle v1=new Vehicle();
        //Vehicle constructor without parameter
    }
}

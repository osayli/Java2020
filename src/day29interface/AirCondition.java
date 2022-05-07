package day29interface;

public interface AirCondition extends Vehicle {

      /*
      1)Interface is not a class , but it is an interface
      2)A class should be able to use multiple interface as a parent
      3)in interface, most methods are abstract
      4)we do not need to use abstract keyword for an interface
      5)if we use a variable in the interface, we need to assign a value
      6)in abstract class we can have constructor, but in interface we cannot have constructor
      7)interface cannot have concrete methods other than default and static , but abstract class can have concrete methods
      8)in interfaces all variables are final. and all final variables names must be all uppercase.
       */

      String MAKE="Samsung";

      public abstract void electronicAc();

      public void climateAc();

      void bacteriaKiller();

      void run();

      public default int power(){
            System.out.println("Hybrid engines are increasing their power...");
            return 1000;
      }

      public static String model(){
            System.out.println("The best model....");
            return "The best....";
      }
}

package tau;

public class Ch6bHomeAreaCalculator {
    public static void main(String[] args) {
        /********************
        RECTANGLE 1
         ***********************/
        // Create instance of Rectangle class
        Ch6aRectangle room1=new Ch6aRectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1=room1.calculateArea();
        /********************
         RECTANGLE 2
         ***********************/
        // Create instance of Rectangle class
        Ch6aRectangle room2=new Ch6aRectangle(30,75);
        double areaOfRoom2=room2.calculateArea();

        double totalArea=areaOfRoom1+areaOfRoom2;
        System.out.println("Area of both rooms: "+totalArea);
    }
}

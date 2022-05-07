package practice06;

public class Runner {
    public static void main(String[] args) {
        Circle c1=new Circle(2);
        System.out.println("Circle Radius: "+c1.getRadius());// 2.0
        System.out.println("Circle Area: "+c1.getArea());//12.566370614359172

        Circle c2=new Circle(-2);
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());

        Cylinder c3=new Cylinder(2,5);
        System.out.println("Cylinder radius: "+c3.getRadius());
        System.out.println("Cylinder height: "+c3.getHeight());
        System.out.println("Cylinder Volume: "+c3.getVolume());

        Cylinder c4=new Cylinder(2,-3);
        System.out.println("Cylinder radius: "+c4.getRadius());
        System.out.println("Cylinder height: "+c4.getHeight());
        System.out.println("Cylinder Volume: "+c4.getVolume());

    }
}

package day13statickeywordandvariabletypes;

public class Static01 {
    /*
    To create a static variable add "static" keyword between access modifier
     and data type
     */
    public static int sCounter=0;//Static(class) variable
    public int iCounter=0;//instance variable

    public Static01(){
        sCounter++;
        iCounter++;
    }

    public static void main(String[] args) {
        Static01 obj1=new Static01();
        Static01 obj2=new Static01();
        Static01 obj3=new Static01();

        System.out.println("The value of sCounter is: "+obj1.sCounter);
        System.out.println("The value of iCounter is: "+obj1.iCounter);

        System.out.println("The value of sCounter is: "+obj2.sCounter);
        System.out.println("The value of iCounter is: "+obj2.iCounter);

        System.out.println("The value of sCounter is: "+obj3.sCounter);
        System.out.println("The value of iCounter is: "+obj3.iCounter);

        int age=13;//variable in any method is called local variable.
        // local variable must be assigned before usage.
        //local variables can just be used in a method which they are created
        //Static and instance variables can be used in entire class.

        //System.out.println(c);we can not use c outside its method
    }
         public static int add(int a, int b){
        int c=2;
        return a+b;
         }
}

package day23inheritance;

public class Practice01 {
    int a=12;
    public Practice01(){
        System.out.println("A");
    }
    public Practice01(int a){
        /*
        by using this() you can do constructor call from inside the class. this() must be 1st statement of constructor body and
        you can use only one this() in constructor body
         */

        this();
        System.out.println("B");
    }
    public void rest(){
        System.out.println("XXX");
    }
}


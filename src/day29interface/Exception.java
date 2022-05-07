package day29interface;

/*
try catch: we can handle exception which will throwed inside try body, execution will continue after catch block.
 we handled exception, if we don't re-throw  it, Handling is done and finish by catch.
 throws: we dont touch exception, another class will handle it if not JVM will handle at the end
 */
public class Exception {

    public static void main(String[] args) {
        test();
    }
    public static void test(){

        try{
          String numbers ="12345g";
            System.out.println(Integer.parseInt(numbers));
        }catch( java.lang.Exception e){
            e.printStackTrace();
        }
    }
}

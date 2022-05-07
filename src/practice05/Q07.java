package practice05;

public class Q07 {
    public static void main(String[] args) {
//Write a code that adds given integers except the first one
// and multiplies with the first integer.
     add(2,4,5,6);


    }
    public static void add(int a, int... b) {
        int result = 0;
        for (int w : b) {
            result = result + w;
        }
        result = a *result;
        System.out.println(result);
    }

}

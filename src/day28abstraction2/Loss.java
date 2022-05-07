package day28abstraction2;

public class Loss extends Calculator {
    @Override
    public int addition(int n1, int n2) {
        return -1;
    }

    @Override
    public int multiplication(int n1, int n2) {
        return 1;
    }

    @Override
    public int substraction(int n1, int n2) {
        return n1-n2;
    }

    @Override
    public int division(int n1, int n2) {
        try{
            return n1/n2;
        }catch(ArithmeticException e){
            return -1;
            //we cannot give message because return type is int we can change return type to void in parent class and child classes
        }
/*mustafa sahin solution try it osman
@Override
public int division(int n1, int n2) throws ArithmeticException{
    return n1/n2;
}
Calculator loss1 = new Loss();

try {
    loss1.division(1,0);
} catch (Exception e) {
    e.printStackTrace();
}
 */
}
}

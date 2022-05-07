package replit;

public class VarArgsAddMethod {
    public static void main(String[] args) {
        System.out.println(sum(2,3,1,4,5));
    }
public static int sum(int... a){
        int sum =0;
    for (int i = 0; i < a.length; i++) {
        sum+=a[i];
    }
    return sum;
}
}
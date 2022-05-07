package day17multidimensionalarrayslists;

public class MultiDimensionalArrays03 {
    public static void main(String[] args) {

        //Find the maximum element in 2 dimensional array

        int a[][] = { {5, 0}, {-5, 34}, {65, 22, 31} };
        int x= Integer.MIN_VALUE;//minimum value for integer variable

        for (int[] w:a) {
            for (int k:w) {
                if(k>=x){
                    x=k;
                }
            }
        }
        System.out.println(x);
        //Find the maximum element in 2 dimensional array

        int g= Integer.MAX_VALUE;//maximum value for integer variable

        for (int[] w:a) {
            for (int k:w) {
                if(k<g){
                    g=k;
                }
            }
        }
        System.out.println(g);

    }
}

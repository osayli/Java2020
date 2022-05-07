package day17multidimensionalarrayslists;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {

        //How to create mutidimensional arrays

        int mda1[][]= new int[3][2];

        //how to print multidimensional array on the console
        System.out.println(Arrays.deepToString(mda1));//[[0, 0], [0, 0], [0, 0]]
        //how to assign values to multidimensional array

        mda1[0][1]=9;
        System.out.println(Arrays.deepToString(mda1));//[[0, 9], [0, 0], [0, 0]]
        mda1[2][0]=1;
        System.out.println(Arrays.deepToString(mda1));//[[0, 9], [0, 0], [1, 0]]
        mda1[0][0]=11;
        mda1[1][1]=4;
        mda1[1][0]=5;
        mda1[2][1]=21;
        System.out.println(Arrays.deepToString(mda1));

        //how to create multidimensional array in short way

        int mda2[][]={{2,3},{12},{21,34,56},{4}};
        System.out.println(Arrays.deepToString(mda2));//[[2, 3], [12], [21, 34, 56], [4]]

        //how to print a specific inner array on the console==> use toString() method

        System.out.println(Arrays.toString(mda2[2]));//[21, 34, 56] 3rd inner array
        System.out.println(Arrays.toString(mda2[0]));//[2, 3] 1st inner array
        System.out.println(mda2.length);
        //Task:How to find the number of elements in a multidimensional array
        //1st solution ===my solution
        int numberOfElements=0;

        for (int i = 0; i < mda2.length; i++) {
            for (int j = 0; j < mda2[i].length; j++) {
                numberOfElements++;
            }

        }
        System.out.println(numberOfElements);
        //2. way not good hard coding
        System.out.println(mda2[0].length + mda2[1].length+mda2[2].length + mda2[3].length);

        //3rd way Mr. Alptekin Solution
        int  sum=0;
        for (int[] w: mda2){
                sum=sum+w.length;
        }
        System.out.println(sum);
    }

}

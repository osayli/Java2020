package practice03;

public class Q03 {
    public static void main(String[] args) {
/*
      Create a method and
from a given array find all pairs whose sum is a given number,
{4,6,5,-10,8,5,20} ===> 10
4 + 6 = 10
      5 + 5 = 10
     -10 + 20 = 10

*/
        int givenNumber=10;
        int array [] = {4,6,5,-10,8,5,20};
        findPairs(array,givenNumber);


    }
    public static void findPairs(int arr [],int givenNumber){

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
              if (arr[i]+arr[j]==givenNumber){
                  System.out.println(arr[i]+"+"+arr[j]+"="+givenNumber);
              }
            }
        }
    }
}

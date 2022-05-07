package day20practiceinterview;

public class Q07 {
    public static void main(String[] args) {
        /*
         * Type a code that calculates the average value of array elements
         *
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */
        int arr[]={1,2,3,4,5,6,7};
        if(arr.length==0){
            System.out.println("Hey user! I can not calculate the average of the empty array");
        }
        double sum=0;
        double average=0;
        for(int w:arr){
            sum=sum+w;
        }
        average=sum/arr.length;
        System.out.println("The average is: "+average);




    }
}

package day11dowhileloop;

public class DoWhile01 {
    public static void main(String[] args) {
        /*
        What is the difference between while and do while loop?(Interview Question)
        In while loop sometimes the code inside the body are not executed. It means zero execution is possiple in while loop

         */

        //while loop : Think first then execute
        int i=1;
        while(i<1){
            System.out.println("Hello");
            i++;
        }
        //Do while loop: Do first,then check the condition.
        /*
        In do while loop the codes inside the body are executed at least once.It means zero execution is not possible.
         */
        int k =1;
        do{
            System.out.println("Hello");
            k++;
        }while(k<1);
    }
}

package day09forloops;

public class ForLoop01 {
    public static void main(String[] args) {

        //1. Example: Type code to print 5 time "Hello" on the console
        //1. way not recommended for larger number it is impossible
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println();
        //2. way
        /*
        For repeated actions Java created a structure which is called loop
        1)for loop
        2)While loop
        3)do-while loop
        4)for each loop
         */
        for(int i=1;i<6;i++){
            System.out.println("Hello!");
        }
        System.out.println("=======");
        //2. Example:Type all integers from 11 to 44 in the same line with space
        for(int i=11; i<45;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        //3. Example: Type even integers from 11 to 44 in the same line with space
        for(int i=11; i<45;i++){
            if(i%2==0){
                System.out.print(i+" ");

            }
        }
        System.out.println();
            //4. Example: Type odd integers from 68 to 13 in the same line with a space
            for(int i=68; i>12;i--){
                if(i%2!=0){
                    System.out.print(i+" ");

                }

    }
        System.out.println();
            //5. Example: Type all integers which are divisible by 4 and divisible by 6 from 120 to 11
        for(int i=120; i>10;i--){
            if(i%4==0&&i%6==0){
                System.out.print(i+" ");
            }
        }

}
}
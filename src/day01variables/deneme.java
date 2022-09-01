package day01variables;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class deneme {
    public static void main(String[] args) {
/*        int k=10;
        int mul=1;
        while(k<9){
            mul=mul*k;
            System.out.println(mul);
           k=k+1;
        }
        mul=1;
        System.out.println("================");
        int l=10;

        do{
            mul=mul*l;
            System.out.println(mul);
            l=l+1;
        }while(l<9);*/

        List<Integer> list1 =new ArrayList<>();
        list1.add(12);
        list1.add(23);
        list1.add(1);
        System.out.println(list1);

       int  sum=0;
        for(Integer w:list1){
            if(w==23){
                break;
            }
          sum=sum+w;

            System.out.println(sum);
        }
        for (int i = 1; i <6 ; i++) {
            if(i==3){
                continue;
            }
            System.out.println(i);
        }

    }
}

package replit;

import java.util.ArrayList;
import java.util.List;

public class CommonArrayElements {
    /*
    Write a program to find the common elements between two String Arrays (without case sensitivity)

Input1 : {John,Brad,Ange,Sofia,Emily}

Input2 : {sofia,brad,grace,emily,hazel}

Output : [sofia,brad,emily]
     */
    public static void main(String[] args) {
        String arr1[]={"John","Brad","Ange","Sofia","Emily"};
        String arr2[]={"sofia","brad","grace","emily","hazel"};
        List<String> commonElements= new ArrayList<>();
        for(String w:arr1){
            for(String x:arr2) {
                if (w.equalsIgnoreCase(x)) {
                    if (!commonElements.contains(w)){
                        commonElements.add(x.toLowerCase());
                }
            }
            }
        }
        System.out.println(commonElements);
    }
}

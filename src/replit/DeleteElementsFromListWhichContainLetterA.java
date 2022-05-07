package replit;

import java.util.ArrayList;
import java.util.List;

public class DeleteElementsFromListWhichContainLetterA {
    /*
    Write a program that deletes the letters 'a' from the names in the list given as input.

     INPUT :
     list1={"Ali","Veli","Ayse","Fatma","Omer"}

     OUTPUT :

     [Veli,Omer]
     */
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        list1.add("Ali");
        list1.add("Veli");
        list1.add("Ayse");
        list1.add("Fatma");
        list1.add("Omer");
        System.out.println(list1);
        for(String w:list1){
            if(!(w.contains("a")||w.contains("A"))){
                list2.add(w);
            }
        }
        System.out.println(list2);
    }
}

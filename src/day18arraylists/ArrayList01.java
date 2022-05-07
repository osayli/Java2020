package day18arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        /*
        //How to Remove Duplicates from an ArrayList. [2, 3, 2, 2, 5] ==> [2, 3, 5]
  */
    ArrayList<Integer> originalList = new ArrayList<>();
    originalList.add(2);
    originalList.add(3);
    originalList.add(2);
    originalList.add(2);
    originalList.add(5);
        ArrayList<Integer> uniqueList1 = new ArrayList<>();
        //1st way contains and continue
        for(Integer w:originalList){
            if(uniqueList1.contains(w)){
                continue;
            }else{
                uniqueList1.add(w);
            }
        }
        System.out.println(uniqueList1);
        //2nd way use contains
        for(Integer w:originalList){
            if(!uniqueList1.contains(w)){
                uniqueList1.add(w);
            }
        }
        System.out.println(uniqueList1);
        //3rd way use remove
        ArrayList<Integer> uniqueList2 = new ArrayList<>(originalList);
        System.out.println(uniqueList2);
        int counter=0;
        for(Integer w:originalList){
            for (int i = 0; i < uniqueList2.size(); i++) {
                if(w.equals(uniqueList2.get(i))){
                   counter++;
                }
            }
        if(counter>1){
            for(int k=1; k<counter; k++){
                uniqueList2.remove(w);
            }
        }
        counter=0;


    }
        System.out.println(uniqueList2);
}
}
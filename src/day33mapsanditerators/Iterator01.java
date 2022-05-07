package day33mapsanditerators;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

    public static void main(String[] args) {

        List<String> list1=new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        System.out.println(list1);

        for(String w: list1){
            w=w+"EEE";
        }
        System.out.println(list1);//no change

/*  throw exception:ConcurrentModificationException
        for(String w: list1){
            list1.add(w+"eee");
        }
        System.out.println(list1);

*/
      //with iterator MODİFY ELEMENT

        ListIterator<String> it1=list1.listIterator();

        while(it1.hasNext()){
            Object el=it1.next();
            it1.set(el+"EEE");
        }
        //when we use iterator, we can modify all elements of a list at the same time
        //we cannot nodification with ForEach loop,but we can read the data from the list
        System.out.println(list1);

        ListIterator<String> it4=list1.listIterator();
        while(it4.hasNext()){
            Object el=it4.next();
            System.out.print(el+" ");
        }
        System.out.println();
        ListIterator<String> it5=list1.listIterator();
        while(it5.hasNext()) {
            it5.next();
        }
        while(it5.hasPrevious()){
            Object el=it5.previous();
            System.out.print(el+" ");
        }
        System.out.println();
          //   FİLTER ELEMENTS
        ListIterator<String> it2=list1.listIterator();
        while(it2.hasNext()){
            Object el=it2.next();
            if(el.toString().equalsIgnoreCase("CEEE")){
                it2.remove();
            }

        }
        System.out.println(list1);//[AEEE, BEEE]


           //delete elements
        ListIterator<String> it3=list1.listIterator();
        while(it3.hasNext()){
           it3.next();
            it3.remove();
        }
        System.out.println(list1);//[]
 /*
        we have
        next() => get elements in ascending order
        previous() => get elements from last index
        hasPrevious() => true or false if element exists from the current pointer to previous ones
        hasNext() => true or false if element exists from first index
        remove() => deletes current element
        set() => update current element

        Iterators: When we use iterators, we can make modifications on collections for multiple data
        Collections: Lists, Sets and so on
         */

    }
}

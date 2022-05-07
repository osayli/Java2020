package day33mapsanditerators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator03 {
  /*
        1) when we use Iterator, we will NOT have hasPrevious or previous methods
        2) we can use ListIterator only with lists in Java, but Iterator can be used for all collections

        Map => key value pairs / all keys must be unique
			   HashMap =>
			   HashTable
			   TreeMap
			    hasNext() => checks the condition for elements of a collection
			   	next() => gets elements 1 by 1
			   	hasPrevious() => checks the elements starting from the last index
			   	previous() => get the last element
			   	remove() => delete the current element
			   	next vs hasNext => next returns thelement, but hasNext returns true or false if element exists or not
			   	hasPrevious vs previous => it returns true or false if the element from last index exists, but previous will take the last index and give element from last  going through first
			   	ListIterator => it is applicable only for LISTS
			   	hasNext, next, hasPrevious, previous, remove, set
			   	Iterator => it applies to all collections
			   	hasNext, next, remove



         */


    public static void main(String[] args) {

      Set<String> set1=new HashSet<>();
      set1.add("Ali");
      set1.add("Veli");
      set1.add("Ayse");
        System.out.println(set1);//[Veli, Ayse, Ali]

      Iterator<String> it1 =set1.iterator();

      while(it1.hasNext()){
          Object el=it1.next();
          System.out.println(el);
          it1.remove();
      }
        System.out.println(set1);
    }
}

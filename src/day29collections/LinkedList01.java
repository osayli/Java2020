package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> ll1=new LinkedList<>();
        ll1.add("Ali");
        ll1.add("Can");
        ll1.add("Mark");
        ll1.add("Tom");

        System.out.println(ll1);//[Ali, Can, Mark, Tom]

        //element():returns fist element without removing
        String firstElement=ll1.element();
        System.out.println(firstElement);//Ali
        System.out.println(ll1);//[Ali, Can, Mark, Tom]

        //poll():returns fist element and  removing from list
        String firstElement2=ll1.poll();
        System.out.println(firstElement2);//Ali
        System.out.println(ll1);//[Can, Mark, Tom]

        //peak()::returns fist element without removing
        String firstElement3=ll1.peek();
        System.out.println(firstElement3);//Can
        System.out.println(ll1);//[Can, Mark, Tom]

        LinkedList<String> ll2=new LinkedList<>();
        //NoSuchElementException
        //System.out.println(ll2.element());

        //returns null if there is no element
        System.out.println(ll2.peek());//null

        //returns  null if there is no node.
        System.out.println(ll2.poll());//null

        LinkedList<Integer> ll3=new LinkedList<>();
        ll3.add(0,12);//when I want to use order the elements I can place them with indexes
        ll3.add(1,13);
        ll3.add(2,10);
        ll3.add(3,11);

        System.out.println(ll3);//[12, 13, 10, 11]

        //remove(): removes first nodes from list and returns first element
        Integer first=ll3.remove();
        System.out.println(first);//12
        System.out.println(ll3);//[13, 10, 11]

        //remove(index): removes element in index and return element in index
        Integer i= ll3.remove(2);
        System.out.println(i);//11
        System.out.println(ll3);//[13, 10]


    }
}

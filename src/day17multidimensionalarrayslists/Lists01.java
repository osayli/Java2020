package day17multidimensionalarrayslists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

        int length=2;
        int arr[]=new int[length];
        /*
        1)When we create array ,we must declare the length of array otherwise we can not create array.
        2)After declaring the length it is impossible to store more elements in it, it is not good.
        3)Java created another structure to store multiple elements,it is "ArrayLists".
        ArrayLists are flexible in length. It means while you create ArrayList no need to declare the length.
        After creating ArrayList you may store any number of elements, there is no restriction about it.
        4)Arrays can contain primitive data types and references, but ArrayList can contain just "non-primitive" data type.
        int==>Array but Integer==>ArrayList. char==>Array but Character==>ArrayList
        */
        //How to create ArrayList
        //1st way
        ArrayList<Integer> al1=new ArrayList<>();
        //2. way
        ArrayList<Integer> al2=new ArrayList<Integer>();
        //3rd way preferable
        List<Integer> al3=new ArrayList<>();

        //how to print list on the console

        System.out.println(al1);//[]

        //how to add elements in to a Arraylist
        //Note:add() method puts the elements in ArrayList according to insertion order
        al1.add(11);
        System.out.println(al1);//[11]
        al1.add(12);
        al1.add(5);
        System.out.println(al1);//[11, 12,5]
        al1.add(1,99);
        System.out.println(al1);//[11, 99, 12, 5]

        //how to get the number of element in an ArrayList
        int numOfElement=al1.size();
        System.out.println(numOfElement);//4
        //or
        System.out.println(al1.size());//4
        System.out.println(al2.size());//0

        //Note: when you talk about number of elements in an Array tell "Array length"
        //Note: when you talk about number of elements in an ArrayList tell "List size"

        //How to check if an ArrayList is empty or not

        //1st way
        if(al1.size()==0){
            System.out.println("It is empty");
        }else{
            System.out.println("It is not empty");
        }
        //2nd method
        if(al1.isEmpty()){
            System.out.println("It is empty");
        }else{
            System.out.println("It is not empty");
        }
        System.out.println(al1.isEmpty());//false
        System.out.println(al2.isEmpty());//true

        //how to check if an ArrayList is has space in it.
        List<String> al4=new ArrayList<>();
        al4.add("a");
        al4.add(" ");
        System.out.println(al4);
        for (String w:al4){
            if(w==" "){
                System.out.println("There is space");
            break;
        }
    }
        //create a String ArrayList, add 5 elements in to it, remove a specific  element.

        List<String> al5=new ArrayList<String>();
        al5.add("Christian");
        al5.add("Alex");
        al5.add("Tommy");
        al5.add("Adriana");
        al5.add("Tom");
        System.out.println(al5);//[Christian, Alex, Tommy, Adriana, Tom]

        al5.remove("Alex"); //it will return boolean. true==> mission completed- false==>could not remove
        System.out.println(al5);//[Christian, Tommy, Adriana, Tom]

        al5.remove("Ali");//could not remove

        //how to remove an element by index. for exaple 2nd element
        al5.remove(1);//it will return the removed element to double check
        System.out.println(al5);//[Christian, Adriana, Tom]

        //create an Integer ArrayList, add 5 elements it, remove a specific element
        ArrayList<Integer> al6=new ArrayList<>();
        al6.add(12);
        al6.add(13);
        al6.add(7);
        al6.add(32);
        al6.add(1);
        System.out.println(al6);//[12, 13, 7, 32, 1]

        //when you Integers to remove, you have to use remove() with index, remove() with specific element cannot be used
        al6.remove(1);//to remove 13 we cannot use al6.remove(13);
        System.out.println(al6);//[12, 7, 32, 1]

        //how to remove a specific integer fron an integer List

        //1st Step:Create an Integer Wrapper Class object by using the value which you want to remove
        Integer el=Integer.valueOf(32);//Integer el=new Integer(32);==>Integer el=Integer.valueOf(32);
        //2nd step: use the created Object inside the remove()
        al6.remove(el);
        System.out.println(al6);//[12, 7, 1]

        //Task: Create a String ArrayList, add 5 elements in it, remove the elements whose length are less than 5.

        List<String> al7=new ArrayList<String>();
        al7.add("Christian");
        al7.add("Alex");
        al7.add("Tommy");
        al7.add("Adriana");
        al7.add("Tom");
        System.out.println(al7);//[Christian, Alex, Tommy, Adriana, Tom]

        //Clone the al7 and use the cloned Arraylist inside the loop
        List<String> clonedAl7=new ArrayList<String>(al7);
        System.out.println(clonedAl7);//[Christian, Alex, Tommy, Adriana, Tom]
        for(String w:clonedAl7){
            if(w.length()<5){
                al7.remove(w);
            }
        }
        System.out.println(al7);//[Christian, Tommy, Adriana]

}
}
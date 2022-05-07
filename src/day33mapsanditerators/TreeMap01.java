package day33mapsanditerators;
   	/*
	 1)TreeMap puts the elements in natural order
	 2)TreeMap is the slowest Map.
	 3)TreeMap is not synchronized and not tread-safe
	 4)TreeMap does not accept null as a key but accepts multiple null as a values

	 */

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {

        TreeMap<String,Integer> tm1=new TreeMap<>();

        tm1.put("Ali",3000);
        tm1.put("Tom",500);
        tm1.put("Alexandra",12000);
        tm1.put("Mark",5000);
        tm1.put("Angelina",23000);
        tm1.put("Walker",null);
        tm1.put("Talker",null);
        System.out.println(tm1);//{Alexandra=12000, Ali=3000, Angelina=23000, Mark=5000, Talker=null, Tom=500, Walker=null}

        //What is the best way to place elements of a map in natural order
        HashMap<String,Integer> hm1=new HashMap<>();

        hm1.put("Ali",3000);
        hm1.put("Tom",500);
        hm1.put("Alexandra",12000);
        hm1.put("Mark",5000);
        hm1.put("Angelina",23000);
        hm1.put("Walker",null);
        hm1.put("Talker",null);
        System.out.println(hm1);
        TreeMap<String,Integer> tm2=new TreeMap<>(hm1);
        System.out.println(tm2);
    }
}

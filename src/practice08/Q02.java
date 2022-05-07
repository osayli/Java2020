package practice08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q02 {
    /*

     */

    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Honda", 2021);
        map1.put("Toyota", 2018);
        map1.put("Porche", 2020);
        map1.put("Ferrari", 2017);
        map1.put("Mercedes", 2013);
        System.out.println(map1);

        //print all keys on the console
        System.out.println(map1.keySet());
        //print values on the console
        System.out.println(map1.values());

        //print all key values pairs ==>My car is "Honda" and the year is 2021

        Set<Map.Entry<String,Integer>> set1=map1.entrySet();

        for(Map.Entry<String,Integer> w:set1){
            System.out.println("My car is "+w.getKey()+ " and the year is "+w.getValue());
        }



    }
}

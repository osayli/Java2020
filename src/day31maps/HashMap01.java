package day31maps;

import java.util.*;

public class HashMap01 {
    /*
    MAPS:
 1)Maps use "{  }"
 2)All elements of maps are in key-value structure
 3)Keys must be unique
 4)Values can be repeated
 5)in Map declaration data types must be non-primitive
 */

/*
 1)HashMap is the fastest Map
 2)HashMap does not put the elements in any order, elements are in random order.
 3)if you use same key to put a new element, it overrides the old one.
 4)we can add elements which key is null. you can use just one null as key.
 5)you can use multiple null for values
 6)HashMap is not-synchronized. It is not-thread safe and can't be shared between many threads

 */

    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(100,"Ali");
        hm.put(101,"Veli");
        hm.put(102,"Can");
        hm.put(103,"Canan");
        hm.put(null,"Ali");
        System.out.println(hm);//{null=Ali, 100=Ali, 101=Veli, 102=Can, 103=Canan}

        hm.put(null,"Kemal");
        System.out.println(hm);//{null=Kemal, 100=Ali, 101=Veli, 102=Can, 103=Canan}

        hm.put(104,null);
        hm.put(105,null);
        System.out.println(hm);//{null=Kemal, 100=Ali, 101=Veli, 102=Can, 103=Canan, 104=null, 105=null}

        HashMap<Integer,String> hm2=new HashMap<>();
        hm.put(87,"KKK");
        hm.put(100 ,"LLL");

        hm.putAll(hm2);
        System.out.println(hm);//{null=Kemal, 100=LLL, 101=Veli, 102=Can, 103=Canan, 87=KKK, 104=null, 105=null}
//when we add elements of a map to another map values and key data types must be same
        System.out.println(hm.size());//8
       //putIfAbsent:add element if there is no element with the same key
        hm.putIfAbsent(102,"ZZZ");
        System.out.println(hm);//{null=Kemal, 100=LLL, 101=Veli, 102=Can, 103=Canan, 87=KKK, 104=null, 105=null}
        hm.putIfAbsent(999,"Well");
        System.out.println(hm);//{null=Kemal, 100=LLL, 101=Veli, 102=Can, 103=Canan, 87=KKK, 999=Well, 104=null, 105=null}

        String value=hm.get(999);
        System.out.println(value);//Well
        String value1=hm.get(43);
        System.out.println(value1);//null

        System.out.println(hm.getOrDefault(999,"This key is not in the Map"));//Well
        System.out.println(hm.getOrDefault(22,"This key is not in the Map"));//This key is not in the Map

        System.out.println(hm.keySet());//[null, 100, 101, 102, 103, 87, 999, 104, 105]

        Set<Integer> myKeys=hm.keySet();
        System.out.println(myKeys);//[null, 100, 101, 102, 103, 87, 999, 104, 105]

        Collection<String> myValues=hm.values();
        System.out.println(myValues);//[Kemal, LLL, Veli, Can, Canan, KKK, Well, null, null]

        Set<Map.Entry<Integer,String>> setFromMap= hm.entrySet();
        System.out.println(setFromMap);//[null=Kemal, 100=LLL, 101=Veli, 102=Can, 103=Canan, 87=KKK, 999=Well, 104=null, 105=null]
        for (Map.Entry<Integer,String> w:setFromMap) {

           // System.out.print(w+"* ");
            //System.out.print(w.getKey());
            //System.out.println(w.getValue());
            System.out.println("Key:"+w.getKey()+" Value: "+w.getValue());
        }

        }



    }


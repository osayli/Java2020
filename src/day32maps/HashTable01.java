package day32maps;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable01 {

    /*
	 1)HashTable is synchronized and tread-safe
	 2)HashTable does not accept null as a key or value
	 3)HashTable puts the element in random order
	 4)HashTable is slower than HashMap
	 ==>if you need some maps tread safe and synchronized use Hashtable
	 note:Tread safety==>tread safe or tread safe code in Java refers to code that can safely be utilized
	 in concurrent or multi-tread environment , and they will behave as expected
	 */
    public static void main(String[] args) {
        Hashtable<String,Integer> ht=new Hashtable<>();
        ht.put("Ali",300);
        ht.put("Tom",500);
        ht.put("Alexandra",12000);
        ht.put("Mark",5000);
        System.out.println(ht);//{Ali=300, Mark=5000, Tom=500, Alexandra=12000}

        System.out.println(ht.containsKey("Ali"));//true
        System.out.println(ht.containsKey("Orcun"));//false
        System.out.println(ht.containsValue(300));//true
        System.out.println(ht.containsValue(5));//false

        Hashtable<String,Integer> ht2=new Hashtable<>();
        ht2.put("Ali",300);
        ht2.put("Tom",500);
        ht2.put("Alexandra",12000);
        ht2.put("Mark",5000);
        System.out.println(ht2);

        System.out.println(ht.equals(ht2));//true

        System.out.println(ht.isEmpty());//false

    }
}

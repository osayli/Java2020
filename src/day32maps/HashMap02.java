package day32maps;

import com.sun.security.jgss.GSSUtil;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap02 {
/*Create a HashMap and give key value pairs as following;
Math = 8
Java = 9
SDLC = 9
API  = 7
 */
public static void main(String[] args) {

    HashMap<String,Integer> hm=new HashMap<>();
    hm.put("Math",8);
    hm.put("Java",9);
    hm.put("SDLC",9);
    hm.put("API",7);
    System.out.println(hm);
    //how can print keys one by one on the console
    Set<String> keys=hm.keySet();//we use Set because keys are unique
    for(String w:keys){
        System.out.print(w+" ");//Java API Math SDLC
    }
    System.out.println();
    //how can print keys one by one on the console
    Collection<Integer> values=hm.values();//Collection because values can be duplicated.
    for(Integer w:values){
        System.out.print(w+" ");//9 7 8 9
    }
    System.out.println();
    System.out.println(hm);//{Java=9, API=7, Math=8, SDLC=9}
    System.out.println(hm.entrySet());//[Java=9, API=7, Math=8, SDLC=9]

    Set<Map.Entry<String,Integer>>  setForm=hm.entrySet();
    System.out.println(setForm);//[Java=9, API=7, Math=8, SDLC=9]
    for(Map.Entry<String,Integer> w:setForm){
        System.out.println(w);
    }
    //How can I see the courses with grade greater than 8

    for(Map.Entry<String,Integer> w:setForm){
        if(w.getValue()>8){
            System.out.println("The course name with grade greater than 8:"+w.getKey());
        }
    }


    //when we use maps, we can print them on the console as a map:
    System.out.println(hm);//{Java=9, API=7, Math=8, SDLC=9}
     //when we use maps, we can print them on the console as a set:
    System.out.println(hm.entrySet());//[Java=9, API=7, Math=8, SDLC=9]
    //when we use maps, we can print all keys the console as a set:
    System.out.println(hm.keySet());//[Java, API, Math, SDLC]
    //when we use maps, we can print all values the console as a set:
    System.out.println(hm.values());//[9, 7, 8, 9]
    //when we want to get specific value from map, we can use get()
    System.out.println("Math result is : "+hm.get("Math"));//Math result is : 8

    //how can I replace elements in my map
//replace with 2 parameters returns me old value of given key
    Integer oldValue=hm.replace("SDLC",10);
    System.out.println(oldValue);//9
    System.out.println(hm);//{Java=9, API=7, Math=8, SDLC=10}
    //replace with 3 parameters:it will check 2 conditions, and 2 condition are true it will change the value of that key
    boolean isTrue=hm.replace("API",7,10);
    System.out.println(isTrue);//true
    System.out.println(hm);//{Java=9, API=10, Math=8, SDLC=10}

    boolean isTrue2=hm.replace("Java",8,10);
    System.out.println(isTrue2);//false
    System.out.println(hm);//{Java=9, API=10, Math=8, SDLC=10}

    //how to remove element from map?
    Integer removed=hm.remove("SDLC");
    System.out.println(removed);//10
    System.out.println(hm);//{Java=9, API=10, Math=8}
    Integer removed2=hm.remove("SDL");
    System.out.println(removed2);//null
    System.out.println(hm);//{Java=9, API=10, Math=8}

    //I can remove entries(elements) from a map based on key-value pairs
    boolean isCorrect=hm.remove("Math",8);
    System.out.println(isCorrect);//true
    System.out.println(hm);//{Java=9, API=10}
    boolean isCorrect2=hm.remove("API",12);
    System.out.println(isCorrect2);//false
    System.out.println(hm);//{Java=9, API=10}
}
}

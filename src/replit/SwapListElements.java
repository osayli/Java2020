package replit;

import java.util.ArrayList;
import java.util.List;

public class SwapListElements {
    /*
    Create a 10-element list. Swap the 8th element with the 3rd element.

INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

Output:

[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
     */
    public static void main(String[] args) {
        List<String> nameList=new ArrayList<>();
        nameList.add("Umit");
        nameList.add("Emin");
        nameList.add("Kemal");
        nameList.add("Kerem");
        nameList.add("Taylan");
        nameList.add("Orhan");
        nameList.add("Sinan");
        nameList.add("Furkan");
        nameList.add("Ahmet");
        nameList.add("Ali");
        System.out.println(nameList);
        String temp=nameList.get(7);
        nameList.set(7,nameList.get(2));
        nameList.set(2,temp);
        System.out.println(nameList);
    }

}


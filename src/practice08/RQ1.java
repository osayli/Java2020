package practice08;


import java.util.*;

public class RQ1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<String> list=new ArrayList<>();

        String str="";

        while(!str.equals("*")){
            str=scan.next();
            if(!str.equals("*")){
                list.add(str);
            }
        }
        System.out.println(list);
        //if they ask you to remove duplicated elements you can use sets

        Set<String> s1= new HashSet<>(list);
        System.out.println(s1);

    }
}

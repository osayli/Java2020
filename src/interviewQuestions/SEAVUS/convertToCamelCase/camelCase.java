package interviewQuestions.SEAVUS.convertToCamelCase;

import java.util.ArrayList;
import java.util.List;

public class camelCase {

    public static void main(String[] args) {
        System.out.println(camelCase("the-stealth-warrior"));
        System.out.println(camelCase("the_stealth_warrior"));
    }

    public static String camelCase(String str){
        String result="";
        List<String> l1=new ArrayList<>();
       if(str.contains("_")) {
           l1 = List.of(str.split("_"));
       }else{
          l1 = List.of(str.split("-"));
       }
      for(String s:l1){
          result=result+s.substring(0,1).toUpperCase()+s.substring(1);
      }
      if(result.substring(0,1).equals(str.substring(0,1))){
          return  result;
      }
        return  str.substring(0,1)+result.substring(1);
    }
}

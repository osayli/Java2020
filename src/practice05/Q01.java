package practice05;

public class Q01 {
    public static void main(String[] args) {
//what is output
      StringBuilder sb=new StringBuilder();
      sb.append("aaa").insert(1,"bb").insert(4,"cc");

      System.out.println(sb);//abbacca


    }
}

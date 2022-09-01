package leetcode;

public class LCE14LongestCommonPrefix {
    public static void main(String[] args) {
        String strs1[] = {"flower","flow","flight"};
        String strs[] = {"ab","a"};
        System.out.println(longestCommonPrefix(strs));
    }


    public static String longestCommonPrefix(String[] strs) {
        String result="";
        int minLength=Integer.MAX_VALUE;
        int counter=0;
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].length()<minLength){
                minLength=strs[i].length();
            }
        }
        for(int i=0;i<minLength;i++){
            String s=strs[0].substring(i,i+1);
            for (int j = 1; j <strs.length; j++) {
                if(s.equals(strs[j].substring(i, i + 1))){
                  continue;
                }else{
                  counter++;
                }

            }
            if(counter>0){
                break;
            }else{
                result=result+s;
            }
        }
   return result;
    }
}

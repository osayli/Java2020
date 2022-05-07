package day26exception;
//!!!!! NullPointerException !!!!
public class Exception03 {
    public static void main(String[] args) {
       String str="";
       getNumberOfCharactersInString(str);//0
        String s="Ali Can";
        getNumberOfCharactersInString(s);//7
        String t=null;
        /*
        NullPointerException: Cannot invoke "String.length()" because "str" is null
         */
        getNumberOfCharactersInString(t);
    }
    public static void getNumberOfCharactersInString(String str){
       try {
           System.out.println(str.length());
       }catch(NullPointerException e){
           System.out.println("Issue occured when I want to count the number of characters==> "+e.getMessage());
           e.printStackTrace();//if you want to see details about the issue,you can use e.printStackTrace() without sout
       }
    }
}

package practice05;

public class Q06 {
    public static void main(String[] args) {

        //Type a code that joins the given Strings
//input => "Dear", "Ali", "Can", "we", "miss", "you"
//output => "Dear Ali Can we miss you"
        join("Dear", "Ali", "Can", "we", "miss", "you");


    }
    public static void join(String... str){
        String output="";
        for(String w:str){
            output=output+w+" ";
        }
        System.out.println(output);
    }
}

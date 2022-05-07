package day27exception;
//!!!!! StringIndexOutOfBoundsException !!!
public class Exception05 {
    /*
    1) you can use multiple catch blocks with a try block.
    2)when you use multiple catch blocks,just one of them can be executed at the same time
    3)try block cannot be used lonely. it needs at least one catch block

     */
    public static void main(String[] args) {
        String s="Hello!";
        getCharacterFromStringByIndex(s,2);//l
        System.out.println("=============================");
        getCharacterFromStringByIndex(s,6);//StringIndexOutOfBoundsException
        System.out.println("=============================");

        divideLengths(s,1,5,3);//2
        System.out.println("=============================");
        divideLengths(s,1,7,3);//StringIndexOutOfBoundsException
        System.out.println("=============================");
        divideLengths(s,1,5,1);//ArithmeticException

    }

    public static void getCharacterFromStringByIndex(String str,int idx){
        try {
            System.out.println(str.charAt(idx));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("An issue occureed in character selection===>"+e.getMessage());
        }
    }

    public static void divideLengths(String str,int idx1,int idx2,int idx3){
        /*
        StringIndexOutOfBoundsException  and ArithmeticException can be occurred
         */

        try{
            int firstLength=str.substring(idx1,idx2).length();
            int secondLength=str.substring(idx1,idx3).length();
            System.out.println(firstLength/secondLength);
        }catch(ArithmeticException e){
            System.out.println("An issue occurred in division==>"+e.getMessage());
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("An issue occureed in character selection===>"+e.getMessage());
        }


    }
}

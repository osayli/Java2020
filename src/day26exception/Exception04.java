package day26exception;
//!!!! NumberFormatException!!!!!
public class Exception04 {
    public static void main(String[] args) {
        String str="123";
        convertStringToInteger(str);//124
        String str2="123a";
        convertStringToInteger(str2);

    }
    /*
    Note: Integer Class has 2 methods for convert to integer. Integer.valueOf() and parseInt(),
    difference between are return type
    Integer.valueOf===>Integer
    Integer.parseInt===>int
     */
    public static void convertStringToInteger(String str) {
        try {
            System.out.println(Integer.parseInt(str) + 1);
        } catch (NumberFormatException e) {
            //err change the message to red colered one
            System.err.println("String could not be converted to an integer==>"+e.getMessage());

        }
    }
}

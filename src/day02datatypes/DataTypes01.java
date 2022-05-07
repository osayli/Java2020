package day02datatypes;

public class DataTypes01 {
    /*
    What is the difference between primitive and non-primitive data types
    1) Primitive data types contain just values non-primitives data types contain value+methods
    2) Primitive data type name start with lowercase non- primitive start with uppercase
    3) Primitives created by Java developers can not create primitive data types
    but non primitive data types can be created either by Java or developers
    4) Non-primitive data types use same size memory but primitive use different size of memory

    */
    public static void main(String[] args) {
        // Primitive data types: boolean, char, byte, short, int, long, float, double
        // 1) Boolean has 2 values which are true or false.  A boolean variable uses just one bit in a memory
        boolean isRetired=false;
        boolean isOld=true;
        //2) Char is just a single character. It uses 16 bits iin memory
        char initial='A';
        //3) Byte is for whole numbers between -128 to 127. It uses 8 bits in the memory
        byte mathGrade=67;
        //4) Short is whole number  between -32.768  to 32767. It uses 16 bits in the memory
        short numberOfStudent=3456;
        //5) int is whole number  between -2.147.483.648 to -2.147.483.647. It uses 32 bits in the memory
        int annualProfitOfApple=20000000;

        //6) Long  is whole number  between ... ....  It uses 16 bits in the memory. must use uppercase or lowercase L at the end of value
        long populationOfWorld=700000000000L;
        //7) Float is for decimals İt uses 32 bits in the memory. Must use F at the end of value
        //İn double decimal part can contain up to 7 digit
        float priceOfShirt=12.99F;
        //8) Double is for decimals İt uses 64 bits in the memory. Double is more sensitive  and accurate than float
        //İn double decimal part can contain up to 16 digit
        double weightOfCell=0.000012334;



        // Non primitive data type
        String s="Ali";

        System.out.println(s.toUpperCase()); //ALI
        System.out.println(s.toLowerCase());//ali
    }

}

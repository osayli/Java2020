package day23inheritance;

class Runner {
    public static void main(String[] args) {

        //data type obj    constructor
        Practice03 p1 = new Practice03("Wow");//ABCD
        /*
        Java selects variables by looking at the date type of the object. if a class does not have the variable
        Java look for it parent classes. if parents classes do not have it, Java will give error.
         */
        System.out.println(p1.a);//14 use the nearest one
        p1.rest();//ZZZ==>for methods Java looks constructor. because of we use the same constructor for all object it print all the same
        Practice02 p2 = new Practice03("Wow");//ABCD
        System.out.println(p2.a);//13 use the nearest one
        p2.rest();//ZZZ
        Practice01 p3 = new Practice03("Wow");//ABCD
        System.out.println(p3.a);//12 use the nearest one
        p3.rest();//ZZZ
        Object p4 = new Practice03("Wow");//ABCD
        Practice02 p5 = new Practice02();
        p5.rest();//YYY
    }
}

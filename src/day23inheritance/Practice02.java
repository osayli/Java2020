package day23inheritance;

class Practice02 extends Practice01 {
    int a = 13;

    public Practice02() {
        //super() must be 1st statement of constructor body. you can use super() only once in a constructor body
        super(12);
        System.out.println("C");
    }

    public Practice02(int a) {
        System.out.println("E");
    }

    public void rest() {
        System.out.println("YYY");
    }
}

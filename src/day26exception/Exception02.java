package day26exception;
////!!!!! ArrayIndexOutOfBoundsException!!!!
public class Exception02 {
    public static void main(String[] args) {
        String array[] = {"Ali", "Can", "Veli", "Han"};
        getAnElementFromAnArray(array, 1);//Ali
        getAnElementFromAnArray(array, 3);//Han
        /*
        ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
         */
        getAnElementFromAnArray(array, 5);
    }
        public static void getAnElementFromAnArray(String arr[], int idx){
            try {
                System.out.println(arr[idx]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.err.println("An error occurred in array operation" + e.getMessage());
            }
        }
    }

package oficehour01;
import java.util.Scanner;
public class Q06 {

        public static void main(String[] args) {
            Scanner in  = new Scanner(System.in);
            System.out.println("Please enter the number from range 1 to 7 to get the week day");
            int num = in.nextInt();

            //print out the number
            System.out.println(checkweekday(num));
        }
        public static String checkweekday(int day){
            String dayname = "";
            switch (day){
                case 1:
                    dayname = "Monday";
                    break;
                case 2:
                    dayname = "Tuesday";
                    break;
                case 3:
                    dayname = "Wednesday";
                    break;
                case 4:
                    dayname = "Thursday";
                    break;
                case 5:
                    dayname = "Friday";
                    break;
                case 6:
                    dayname = "Saturday";
                    break;
                case 7:
                    dayname = "Sunday";
                    break;
                default:
                    dayname =  "please enter correct input";
            }
            return dayname;
        }
    }


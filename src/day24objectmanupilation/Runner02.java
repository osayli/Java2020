package day24objectmanupilation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner02 {
    /*
Ask user to type 2 names and 2 lastnames
Then concatenate them to create emails
use @gmail.com at the end
use lists..
 */
    public static void main(String[] args) {
        List<String> fistName=new ArrayList<>();
        List<String> lastName=new ArrayList<>();

        Scanner scan =new Scanner(System.in);
        System.out.println("Please type two first name");
        fistName.add(scan.nextLine().toLowerCase().replaceAll(" ",""));
        fistName.add(scan.nextLine().toLowerCase().replaceAll(" ",""));

        System.out.println("Please type two last name");
        lastName.add(scan.nextLine().toLowerCase().replaceAll(" ",""));
        lastName.add(scan.nextLine().toLowerCase().replaceAll(" ",""));

        System.out.println(fistName);
        System.out.println(lastName);

        System.out.println("The email list: "+getEmailList(fistName,lastName));

    }
  public static List<String> getEmailList(List<String> firstName,List<String> lastName){
        List<String> emailList=new ArrayList<>();
      for (int i = 0; i < firstName.size(); i++) {

          emailList.add((firstName.get(i)+lastName.get(i)+"@gmail.com"));//.replaceAll(" ","").toLowerCase() for this we do same thing

      }
      return emailList;
  }
}

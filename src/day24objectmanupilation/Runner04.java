package day24objectmanupilation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner04 {
    /*
 Create 3 person object
 Then create a method to concatenate the names with lastnames and add also "@gmail.com"
 Finally print them on the console
  */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Person person1=new Person("Kubra","Tekin");
        Person person2=new Person("Serjan","iskrenov");
        Person person3=new Person("Ali","Bingul");
        List<Person> personList=new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        System.out.println(personList);//[day24objectmanupilation.Person@6f539caf, day24objectmanupilation.Person@79fc0f2f, day24objectmanupilation.Person@50040f0c]
        System.out.println(personList.size());//3

        System.out.println(getEmail(personList));//[kubratekin@gmail.com, serjaniskrenov@gmail.com, alibingul@gmail.com]

    }
    public static List<String> getEmail(List<Person> personList){
        List<String> emailList=new ArrayList<>();
        for(Person w: personList){
            emailList.add((w.name+w.lastName+"@gmail.com").replaceAll(" ","").toLowerCase());
        }
        return emailList;
    }

}

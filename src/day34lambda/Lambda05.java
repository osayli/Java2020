package day34lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda05 {

    public static void main(String[] args) {

        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Autumn", "English Night", 93, 144);

        //System.out.println(courseTurkishDay);

        List<Courses> coursesList=new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);
        //System.out.println(coursesList);
        System.out.println(checkAverageScore(coursesList,90));//true
        System.out.println(checkAverageScore(coursesList,95));//false
        System.out.println(checkCourseName(coursesList,"Turkish"));//true
        System.out.println(checkCourseName(coursesList,"Germany"));//false

    }
    /*
    1)Create a method to check if all average scores are greater
     than given number
    */
    public static boolean checkAverageScore(List<Courses> coursesList,int score){
      return coursesList.
                   stream().
              allMatch(t->t.getAverageScore()>score);
    }

    /*
    2)Create a method to check if at least one of
    the course names contains "Turkish" word
     */
    public static boolean checkCourseName(List<Courses> coursesList,String str){
        return coursesList.
                stream().anyMatch(t->t.getCourseName().contains(str));
    }
}

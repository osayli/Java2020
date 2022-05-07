package day14statickeywordarraysforeachloop;

public class StudentRunner {

    public static void main(String[] args) {
        //to access static class menbers class name is enough to access

        System.out.println(Student.counter);

        //to access non-static class members you have to create object.
    Student std1=new Student();
        System.out.println(std1.studentId);

    }
}

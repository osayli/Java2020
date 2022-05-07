package day27exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
note1: when you type code, Java will give red underline for some Exceptions
before running the code. That exception are called "Compile Time Exception"(check exception)
They are
 1)FileNotFoundException: this exception is thrown if the path is wrong or the file is deleted.
 2)IOException          :this exception handles all issues related with  input-output.
 Note a)FileNotFoundException is the child of IOException.
 Note b)if there is parent -child relationship between exception classes,
      child exception class must have come before parent exception class  in usage multiple catch blocks.
Note c) to execute a code block under every condition, put the code inside the "finally" block

note2: a)try block cannot be used alone
       b)try-block can be used with a single catch block
       c)try-block can be used with multiple catch blocks
       d)try-block can be used just with finally block
       e)try block can be used with a single or multiple catch block and finally block
Note 3:Exception class is parent of all exception classes
 */
public class Exception07 {
    // !!!                      !!!
    public static void main(String[] args) {
        goAndReadFile();

    }
    public static void goAndReadFile(){
        try {
            FileInputStream fsi=new FileInputStream("C:\\Users\\Acer\\IdeaProjects\\winter2022java\\src\\day27exception\\File01.txt");
            int k=0;
            while ((k=fsi.read())!=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("There is an issue about reaching file or existance of file..."+e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Connection was broken");
        }
    }
}

package day25overridingandencapsulation;
/*
  1)Encapsulation means data hiding
  2)How to hide data?
     answer:make them private
  3)Can you read encapsulated data from other classes?
     Answer:yes, I create "getter method(Java Bean)" for encapsulated data then by using "getter method" we can read it from other classes
  4)Can you change encapsulated data from other classes?
    Answer:yes, I create "setter method(Java Bean)" for encapsulated data then by using "setter method" we can change the value of it from other classes
  5)return type of getter() method must be same with the data type of the variables
    return type of "setter() method" will be void every time.
  6)getter method does not use any parameter, but setter method uses a single parameter whose data type is same with tha data type of the variable
  7)getter and setter methods must be inside the class with encapsulated variable.
  8)setter method always need a parameter.
  9)getter methods for boolean variables start with "is", does not start with "get".
  10)What should you do if you do not want to make your variable value readable?
  Answer: do not create getter.
  What should you do if you do not want to update your variable value?
  Answer: do not create setter.
  What should you do if you do not want to make your variable value neither readable nor updatable?
  Answer: do not create getter and setter.

  Note: if you do not create any setter for any variable, then class is called "immutable class". ex: String class in Java

  11)4) The advantages of Encapsulation
	   a)it gives us flexibility, whenever we want, we can update  encapsulated data by using setter methods
	   b)Reusability, we create getter and setter methods just ones and use them again and again from different classes.
	   c)Maintainability, by using setter method we can update the value whenever we want.
 */

public class CreditCard {

    private String ccn="12345678901234";
    private int age=21;
    private boolean isExpired=false;

    //by using "getter method" we can read the value of encapsulated data from other classes
    public String getCcn() {
        return ccn;
    }
    //by using setter method we can update the value of encapsulated data from other classes
    public void setCcn(String ccn) {
        this.ccn = ccn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }
}

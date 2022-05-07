package day21varargsstringbuilderaccessmodifiers;

public class Student extends Parent {
    /*
    1)if you do not type any access modifier, it means the access modifier is "default"
    2)"public" class members(variables and methods) are accessible from entire the project
    3)"private" class member can not be accessible from other classes and from other packages
       "private" class member can  be accessible just from the class which it is created
    4)"default(package private)" class member cannot be accessible  from other package
    5)"protected" class member can be accessible from child classes in any package
      "protected" class member cannot be accessible from other package if you are not the same package
    6)A class cannot be protected and cannot be private.
       protected and private access modifiers are just for class member not for classes.
     */

    /*
    /*
                      Access Levels
Modifier     Class  Package    Subclass   World
public         Y      Y          Y          Y
protected      Y      Y          Y          N
no modifier    Y      Y          N          N
private        Y      N          N          N
* */

    /*!!!!!!!!! interview Questions !!!!!!!!
    1)What is the difference between "public" and "default"?
    Answer: no restriction for public in entire the project
            no restriction for default in entire the package
    2)What is the difference between "protected" and "default"?
    Answer:no restriction for default in entire the package
           no restriction for protected in entire the package plus any child class from entire project.
     3)What is the difference between "public" and "protected"?
     Answer: no restriction for public in entire the project
            no restriction for protected in entire the package plus any child class from entire project.
     */
    public String name="Ali Can";

    Integer age=12;

    private char initial='A';


}

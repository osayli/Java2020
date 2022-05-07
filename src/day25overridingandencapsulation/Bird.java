package day25overridingandencapsulation;
/*
  1)access modifier of the overriding method(the method inside the child class) cannot be narrower than the access modifier of
  the overridden method(the method inside the parent class). can be same or wider. For example:
  if overridden method:                "overriding method":
       public                             public
       protected                          protected or public
       default                            protected or protected or public(if you are not in the same package default methods cannot be overridden)
       private                            !!!!!!!!! nothing !!!!!!!
       Note:private methods cannot be overridden.

   2) Return type must have "IS-A" Relationship from  overriding method(child) to   overridden method(parent)

   Note1: to have ""IS-A" relationship we must have "parent-child" relationship. if Java or you did not create "parent-child" relationship
   between the classes you cannot have "IS-A" relationship, therefore you cannot use different return types in overriding.

   Note2:Java did not create "parent-child" relationship between "wrapper classes" because of that if return type is one of the wrapper
    class return type of "overriding method"  must be same with the return type of the "overridden method"
   Note: if the return type is "primitive" you cannot change the return type in overriding.

   Note3:if the return type is "void" you cannot change the return type in overriding.

   3)you cannot update "method name" and "method parameters" in overriding under any condition.
   Note1: "method name" and "method parameters" are the signature of the method(method signature). if you change either of
   them it means you created a new method. but in overriding we should not create a new method. we just change the implementation

   4)"static methods" are common for all object. if you override and change the implementation all other objects will be
   affected from the update but that can create many issues because of that Java does not let to override static methods.
   Note1: from  pdf notes :>>> private, static and final methods cannot be overridden...

   5) "final methods"  body is in the last updated body, you cannot change the body. but we change the body in overriding
   this is contradiction. because of that Java does not let to override "final methods".

   6)What is the difference between "method overloading" and "method overriding"?
    a)"method overloading" is done in a single class but "method overriding" needs multiple classes with parent-child relationship(inheritance)
    b)in "method overloading" we change the method signature but in "method overriding" we do not touch the method signature
    c)private,static,and final methods cannot be overridden but can be overloaded.
    Note:method overloading(static Polymorphism)+method overriding(dynamic polymorphism)="Polymorphism"
 */

public class Bird extends Animal{
    @Override
    public void eat() {
        System.out.println("Birds eat");
    }

    @Override
    public void drink() {
        System.out.println("Birds drink");
    }

    public void tweet(){
        System.out.println("Birds tweet");
    }


}

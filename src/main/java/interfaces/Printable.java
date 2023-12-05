package interfaces;
/*
Interfaces:
What is an Interface?
An interface in Java is a blueprint of a class that defines a set of abstract methods (methods without a body) and, optionally, constants.
It specifies what a class must do but does not provide the implementation details.
Classes implement interfaces by providing concrete implementations for all the methods defined in the interface.
 */

interface Printable {
    void print(); // Abstract method

    // Other abstract methods or constants can be defined here
    default void printList() {
        System.out.println("Default printing...");
    }

    /*
   Interface Static Methods (Java 8+):
   Java 8 also introduced static methods in interfaces.
   These methods can be called using the interface name itself.
   // No need to implement static methods; they can be called using Printable.display()
    */
    static void display() {
        System.out.println("Static display method");
    }

}

class MyClass implements Printable {
    public void print() {
        System.out.println("Printing...");
    }


}

class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.print(); // Calls the print method implemented in MyClass
        obj.printList();
    }
}
 /*    Key Points about Interfaces:
        A class can implement multiple interfaces (Java supports multiple inheritance through interfaces).
        All methods in an interface are public by default.
        Interfaces can't have method implementations; those are left to the implementing classes.
        It helps achieve abstraction and provides a contract that classes must follow.
        Java 8 introduced default methods in interfaces.
        These methods have a default implementation in the interface itself.
        Classes implementing the interface can choose whether to override the default method or not.
  */

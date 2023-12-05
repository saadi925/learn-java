package abstract_classes;

/*
Abstract Classes:
What is an Abstract Class?
An abstract class is a class that cannot be instantiated on its own.
It may contain abstract methods (methods without a body) and concrete methods (methods with implementation).
Abstract classes provide a way to define a blueprint for other classes to extend and implement the abstract methods.
 */
abstract class Shape {
    // Abstract method
    public abstract void draw();

    // Concrete method
    public void display() {
        System.out.println("Displaying shape...");
    }
}

class Circle extends Shape {
    // Implementing the abstract method from the abstract class
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw(); // Calls the draw method implemented in the Circle class
        circle.display(); // Calls the display method from the abstract class
    }
}
/* Key Points about Abstract Classes:
Abstract classes can have abstract methods that must be implemented by subclasses.
They may also have concrete methods with complete implementations that can be used by subclasses without modification.
Abstract classes provide a way to define common behavior for subclasses while leaving specific implementation details to the subclasses.
Abstract Class vs. Interface:

An abstract class can have both abstract and concrete methods, while an interface can only have abstract methods (before Java 8).

A class can implement multiple interfaces but can extend only one abstract class.
When to Use Abstract Classes:
Use an abstract class when you want to provide a common base for subclasses with shared functionality and state.
Use an abstract class when you want to declare methods that must be implemented by subclasses.

. A class can extend only one abstract class
 but can implement multiple interfaces.
 This combination allows for
 flexibility in designing class hierarchies and
 implementing contracts.

 */
package polymorphism;
//Polymorphism is a fascinating concept in object-oriented programming. There are two main types: compile-time polymorphism (method overloading) and runtime polymorphism (method overriding).
//
//        Runtime Polymorphism (Method Overriding):
//        Example:
//        Consider a superclass Animal and a subclass Dog that overrides a method:
class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}



class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
//    Reference Variable: A reference of the superclass (Animal in this case) can refer to a subclass object (Dog), allowing method invocation based on the object type.
//        Dynamic Method Invocation: The actual method called is determined at runtime based on the object type.
//Same Method Name: Methods have the same name but differ in parameters or return types.
//        Decision at Compile-time: The appropriate method is chosen by the compiler based on the method signature.

//    Polymorphism with Method Parameters:
class Vehicle {
    public static void main(String[] args) {
        Garage myGarage = new Garage();
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        myGarage.parkVehicle(car); // Parking a car
        myGarage.parkVehicle(truck); // Parking a truck

    }
}

class Car extends Vehicle {
    // Class definition
}

class Truck extends Vehicle {
    // Class definition
}

class Garage {
    public void parkVehicle(Vehicle vehicle) {
        // Logic to park the vehicle
    }
}
//    Polymorphism with Method Return Types:
class Shape {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape(true); // Creating a circle
        Shape rectangle = factory.createShape(false); // Creating a rectangle

    }
}

class Circle extends Shape {
    // Class definition
}

class Rectangle extends Shape {
    // Class definition
}

class ShapeFactory {
    public Shape createShape(boolean isCircle) {
        if (isCircle) {
            return new Circle();
        } else {
            return new Rectangle();
        }
    }
}
//    Advantages of Using Polymorphism in Method Parameters and Return Types:
//        Flexibility: Methods can accept or return different types, allowing for versatility in functionality.
//        Code Reusability: Same methods can be used with various types of objects, reducing redundant code.
//        This usage of polymorphism with method parameters and return types demonstrates how Java leverages these features to create adaptable and reusable code.
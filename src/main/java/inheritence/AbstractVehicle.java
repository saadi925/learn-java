package inheritence;
//        An abstract class cannot be instantiated on its own; it's meant to be subclassed.
//        Abstract classes can have abstract methods (methods without a body) that must be implemented by the subclass.
abstract class AbstractVehicle {
    String brand;

    public abstract void displayInfo(); // abstract method
}

class TheCar extends AbstractVehicle {
    public void displayInfo() {
        System.out.println("Car information");
    }

}

//    Method Overloading vs. Method Overriding:
//        Method Overloading:
//        In the same class, methods with the same name but different parameters or return types.
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

final class FinalVehicle {
    // class definition
}
// Error: Cannot inherit from final class
// class Car extends Vehicle { }


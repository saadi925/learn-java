package encapsuation;

/* Encapsulation:
What is Encapsulation?
Encapsulation is a fundamental principle in object-oriented programming that involves bundling data (attributes) and methods (functions) that operate on the data within a single unit, i.e., a class.
It helps in hiding the internal state of an object and only exposing the necessary functionalities.
Access Modifiers:
Public: Accessible from anywhere.
Private: Accessible only within the same class.
Protected: Accessible within the same package and subclasses
      Accessible within the same package and by subclasses (even if they are in different packages)
Default (no modifier): Accessible within the same package.
  Accessible within the same package only.
   */
class Car {
    private String brand;
    private int year;

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Toyota");
        myCar.setYear(2022);

        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Year: " + myCar.getYear());
    }
}
/*  Encapsulation helps in maintaining the integrity of data by preventing unauthorized access.
    Access to attributes is controlled through getter and setter methods.
    It allows the class to change its internal implementation without affecting the code that uses the class.

    Benefits of Encapsulation:
      Controlled Access: Restricts direct access to certain data, reducing the chances of accidental misuse.
      Flexibility: Allows the internal representation of an object to be changed without affecting the
        overall system.
      Modularity: Encapsulation helps in creating modular code that is easier to maintain and debug.

      Question :

      differ between default and protected ?
      In Java, both default and protected access modifiers control the visibility of members (fields, methods, constructors) within classes and subclasses. However, they have different scopes and accessibility levels:

      Accessibility:
    Members with default access can be accessed by other classes in the same package.
    They are not accessible outside the package in which they are declared.
 class MyClass {
    int myField; // default access
}
Protected Access Modifier:
Scope: Accessible within the same package and subclasses (even if they are in a different package).
Keyword: protected.
Accessibility:
Members with protected access can be accessed by subclasses (in the same or different packages) and by other classes within the same package.
They are not accessible outside the package if they are not in a subclass relationship.
class MyClass {
    protected int myField;
}
Accessible by: Subclasses and classes within the same package.

      */

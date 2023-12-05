package inheritence;

// Parent class (Superclass)
class Vehicle {
    String brand;
    int year;

    public static void main(String[] args) {
        var my_vehicle = new Vehicle("mercedes", 1998);
        var car = new Car("honda", 2023 , 25000);
        System.out.println(car.year);

    }
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Child class (Subclass) inheriting from Vehicle
class Car extends Vehicle {
    int price;

    public Car(String brand, int year, int price) {
        super(brand, year); // calling the constructor of the superclass
        this.price = price;
    }

    // Additional method specific to Car
    public void displayPrice() {
        System.out.println("Price: $" + price);
    }
}
package methods;

/* Method Hiding:
 Method Hiding vs. Method Overriding:
 In method hiding, a static method in a subclass hides the static method of the same name in the superclass.
 In method overriding, a non-static method in a subclass overrides the non-static method of the same name in the superclass. **/
class Main{
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        Parent.display(); // Calls Parent's static display() method
        Child.display(); // Calls Child's static display() method
        c.show(); // Calls Child's  non-static overridden method '
    }
}
class Parent {

    public static void display() {
        System.out.println("Static method in Parent");
    }
    public void show() {
        System.out.println("Non-static method in Parent");
    }
}

class Child extends Parent {
    public static void display() {
        System.out.println("Static method in Child");
    }
    @Override
    public void show() {
        System.out.println("Non-static method in Child");
    }
}

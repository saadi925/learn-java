package methods;

public class Person {
    String name ;
    int age ;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("John", 20);
        String name = person.getName();
        person.setName("Doe");
        String ChangedName = person.getName();
        System.out.println("Changed the name f/*/* */*/rom " + name + " to " + ChangedName);
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person getPerson() {
        return new Person("Syed", 21);
    };
}

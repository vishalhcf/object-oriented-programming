public class person {
    private String name;
    private int age;

    // Parameterized constructor
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public person(person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        person original = new person("Alice", 25);
        person copy = new person(original);

        original.displayDetails();
        copy.displayDetails();
    }
}
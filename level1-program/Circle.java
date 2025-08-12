public class Circle {
    // Attribute
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display the area and circumference
    public void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        // Creating a Circle object
        Circle circle = new Circle(5.0);

        // Displaying the details of the circle
        circle.displayDetails();
    }
}
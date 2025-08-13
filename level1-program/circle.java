public class circle {
    private double radius;

    // Default constructor
    public circle() {
        this(1.0); // Constructor chaining
    }

    // Parameterized constructor
    public circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        circle defaultCircle = new circle();
        defaultCircle.displayRadius();

        circle customCircle = new circle(5.0);
        customCircle.displayRadius();
    }
}
public class MobilePhone {
    // Attributes
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    // Main method to test the MobilePhone class
    public static void main(String[] args) {
        // Creating a MobilePhone object
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S23", 79999.0);

        // Displaying the details of the mobile phone
        phone.displayDetails();
    }
}
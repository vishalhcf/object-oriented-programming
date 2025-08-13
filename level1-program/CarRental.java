public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        double dailyRate = 1000.0; // Example daily rate
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

     public static void main(String[] args) {
        CarRental rental = new CarRental("Jane Doe", "Toyota Corolla", 5);
        rental.displayDetails();
    }
}
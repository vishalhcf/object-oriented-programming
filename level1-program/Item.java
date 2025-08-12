public class Item {
    // Attributes
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate the total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method to test the Item class
    public static void main(String[] args) {
        // Creating an Item object
        Item item = new Item(101, "Laptop", 75000.0);

        // Displaying the details of the item
        item.displayDetails();

        // Calculating and displaying the total cost for a given quantity
        int quantity = 3;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: " + totalCost);
    }
}
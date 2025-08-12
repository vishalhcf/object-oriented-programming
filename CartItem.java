import java.util.ArrayList;

public class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    public static void main(String[] args) {
        ArrayList<CartItem> cart = new ArrayList<>();
        cart.add(new CartItem("Laptop", 50000.0, 1));
        cart.add(new CartItem("Mouse", 1500.0, 2));

        double totalCost = 0;
        System.out.println("Cart Details:");
        for (CartItem item : cart) {
            item.displayItemDetails();
            totalCost += item.calculateTotalCost();
        }
        System.out.println("Total Cost: " + totalCost);
    }
}
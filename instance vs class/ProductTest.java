class Product {
    // Class variable (static)
    static int totalProducts = 0;

    // Instance variables
    String productName;
    double price;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment whenever a new product is created
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: " + price);
    }

    // Class method (static)
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 25000);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}

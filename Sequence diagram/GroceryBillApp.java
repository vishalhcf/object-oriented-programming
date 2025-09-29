// Product.java
class Product {
    String productName;
    double pricePerUnit;
    double quantity;

    Product(String productName, double pricePerUnit, double quantity) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return pricePerUnit * quantity;
    }
}

class Customer {
    String name;
    Product[] products;

    Customer(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }
}

class BillGenerator {
    public double generateBill(Customer customer) {
        double total = 0;
        for (Product p : customer.products) {
            total += p.getTotalPrice();
        }
        return total;
    }
}

public class GroceryBillApp {
    public static void main(String[] args) {
        Product[] prods = {
            new Product("Apples", 3.0, 2.0), // 2kg @ $3
            new Product("Milk", 2.0, 1.0)    // 1L @ $2
        };

        Customer customer = new Customer("Alice", prods);

        BillGenerator bg = new BillGenerator();
        double totalBill = bg.generateBill(customer);

        System.out.println("Customer: " + customer.name);
        for (Product p : prods) {
            System.out.println(p.productName + " = " + p.quantity + " units @ $" + p.pricePerUnit + " each");
        }
        System.out.println("Total Bill = $" + totalBill);
    }
}

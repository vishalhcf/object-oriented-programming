import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    void show(){
        System.out.println("Product: " + name + " | Price: ₹" + price);
    }
}

class Order {
    int orderId;
    List<Product> products;

    Order(int orderId){
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    void addProduct(Product p){
        products.add(p);
    }

    void showOrderDetails(){
        System.out.println("\nOrder ID: " + orderId);
        double total = 0;
        for(Product p : products){
            p.show();
            total += p.price;
        }
        System.out.println("Total Amount: ₹" + total);
    }
}

class Customer {
    String name;
    List<Order> orders;

    Customer(String name){
        this.name = name;
        this.orders = new ArrayList<>();
    }

    void placeOrder(Order o){
        orders.add(o);
        System.out.println(name + " placed Order ID: " + o.orderId);
    }

    void showMyOrders(){
        System.out.println("\nCustomer: " + name + " Orders:");
        for(Order o : orders){
            o.showOrderDetails();
        }
    }
}

public class EcommerceDemo {
    public static void main(String[] args) {
        // Products
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 1500);
        Product p3 = new Product("Keyboard", 2500);

        // Customers
        Customer c1 = new Customer("Vishal");
        Customer c2 = new Customer("Sonu");

        // Orders
        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(102);
        o2.addProduct(p3);

        // Customers placing orders
        c1.placeOrder(o1);
        c1.placeOrder(o2);

        c2.placeOrder(new Order(103)); // empty order for now

        // Show details
        c1.showMyOrders();
        c2.showMyOrders();
    }
}

class Bank {
    String name;

    Bank(String name){
        this.name = name;
    }

    void openAccount(Customer c){
        System.out.println(c.customerName + " opened an account in " + name);
    }
}

class Customer {
    String customerName;
    double balance;

    Customer(String customerName, double balance){
        this.customerName = customerName;
        this.balance = balance;
    }

    void viewBalance(){
        System.out.println(customerName + " has balance: ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer c1 = new Customer("Vishal", 5000);
        Customer c2 = new Customer("Sonu", 7000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();
    }
}

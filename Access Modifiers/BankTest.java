class BankAccount {
    public String accountNumber;       // Public
    protected String accountHolder;    // Protected
    private double balance;            // Private

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods for balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient Balance!");
    }
}

// Subclass demonstrating access to public + protected
class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder +  // public + protected
                ", Balance: " + getBalance() + ", Interest Rate: " + interestRate + "%");
    }
}

public class BankTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("AC12345", "Ravi", 10000, 5.5);
        sa.displayAccountDetails();
        sa.deposit(2000);
        System.out.println("Balance after deposit: " + sa.getBalance());
        sa.withdraw(5000);
        System.out.println("Balance after withdrawal: " + sa.getBalance());
    }
}

class Employee {
    public int employeeID;        // Public
    protected String department;  // Protected
    private double salary;        // Private

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

// Subclass demonstrating access to public + protected
class Manager extends Employee {
    private String teamName;

    Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + department +  // public + protected
                ", Salary: " + getSalary() + ", Team: " + teamName);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 75000, "Dev Team");
        m.displayManagerDetails();
        m.setSalary(80000);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}

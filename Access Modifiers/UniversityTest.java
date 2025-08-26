// Base Class
class Student {
    public int rollNumber;        // Public
    protected String name;        // Protected
    private double CGPA;          // Private

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public methods to access/modify private CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// Subclass demonstrating protected access
class PostgraduateStudent extends Student {
    private String thesisTitle;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA);
        this.thesisTitle = thesisTitle;
    }

    public void displayDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name +  // accessing public + protected
                ", CGPA: " + getCGPA() + ", Thesis: " + thesisTitle);
    }
}

public class UniversityTest {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Rahul", 8.5, "AI in Healthcare");
        pg.displayDetails();
        pg.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}

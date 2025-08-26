class Course {
    // Class variable
    static String instituteName = "ABC Institute";

    // Instance variables
    String courseName;
    String duration;
    double fee;

    // Constructor
    Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration +
                ", Fee: " + fee + ", Institute: " + instituteName);
    }

    // Class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class CourseTest {
    public static void main(String[] args) {
        Course c1 = new Course("Python", "3 months", 5000);
        Course c2 = new Course("Java", "4 months", 7000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

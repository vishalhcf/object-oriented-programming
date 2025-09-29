import java.util.*;

class Course {
    String courseName;
    List<Student> students;

    Course(String courseName){
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void enrollStudent(Student s){
        students.add(s);
    }

    void showEnrolledStudents(){
        System.out.println("Course: " + courseName);
        for(Student s : students){
            System.out.println("  - " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses;

    Student(String name){
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollCourse(Course c){
        courses.add(c);
        c.enrollStudent(this); // bi-directional association
    }

    void showCourses(){
        System.out.println("Student: " + name);
        for(Course c : courses){
            System.out.println("  - " + c.courseName);
        }
    }
}

class School {
    String name;
    List<Student> students;  // Aggregation (students can exist independently)

    School(String name){
        this.name = name;
        students = new ArrayList<>();
    }

    void addStudent(Student s){
        students.add(s);
    }

    void showStudents(){
        System.out.println("\nSchool: " + name);
        for(Student s : students){
            System.out.println("  - " + s.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        School school = new School("Green Valley School");

        Student s1 = new Student("Vishal");
        Student s2 = new Student("Sonu");

        school.addStudent(s1);
        school.addStudent(s2);

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c1);

        school.showStudents();
        s1.showCourses();
        s2.showCourses();

        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }
}

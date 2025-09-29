import java.util.*;

class Professor {
    String name;
    List<Course> courses;

    Professor(String name){
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void assignCourse(Course c){
        courses.add(c);
        c.setProfessor(this);
        System.out.println("Professor " + name + " assigned to " + c.courseName);
    }

    void showCourses(){
        System.out.println("\nProfessor " + name + " teaches:");
        for(Course c : courses){
            System.out.println("  - " + c.courseName);
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
        c.addStudent(this);
        System.out.println(name + " enrolled in " + c.courseName);
    }

    void showCourses(){
        System.out.println("\nStudent " + name + " enrolled in:");
        for(Course c : courses){
            System.out.println("  - " + c.courseName + " (Professor: " + 
                (c.professor != null ? c.professor.name : "TBA") + ")");
        }
    }
}

class Course {
    String courseName;
    Professor professor;
    List<Student> students;

    Course(String courseName){
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void setProfessor(Professor p){
        this.professor = p;
    }

    void addStudent(Student s){
        students.add(s);
    }

    void showStudents(){
        System.out.println("\nCourse: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.name : "Not Assigned"));
        System.out.println("Enrolled Students:");
        for(Student s : students){
            System.out.println("  - " + s.name);
        }
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        // Professors
        Professor prof1 = new Professor("Dr. Sharma");
        Professor prof2 = new Professor("Dr. Rani");

        // Courses
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");
        Course c3 = new Course("Machine Learning");

        // Assign professors
        prof1.assignCourse(c1);
        prof1.assignCourse(c2);
        prof2.assignCourse(c3);

        // Students
        Student s1 = new Student("Vishal");
        Student s2 = new Student("Sonu");

        s1.enrollCourse(c1);
        s1.enrollCourse(c3);

        s2.enrollCourse(c1);
        s2.enrollCourse(c2);

        // Show details
        s1.showCourses();
        s2.showCourses();
        c1.showStudents();
        c2.showStudents();
        c3.showStudents();
        prof1.showCourses();
        prof2.showCourses();
    }
}

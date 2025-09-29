import java.util.*;

class Faculty {
    String name;

    Faculty(String name){
        this.name = name;
    }

    void show(){
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String deptName;
    List<Faculty> faculties;

    Department(String deptName){
        this.deptName = deptName;
        faculties = new ArrayList<>();
    }

    void addFaculty(Faculty f){
        faculties.add(f);  // aggregation (faculties can exist outside dept)
    }

    void showDept(){
        System.out.println("\nDepartment: " + deptName);
        for(Faculty f : faculties){
            f.show();
        }
    }
}

class University {
    String name;
    List<Department> departments;  // Composition (lifecycle tied to university)

    University(String name){
        this.name = name;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d){
        departments.add(d);
    }

    void showUniversity(){
        System.out.println("\nUniversity: " + name);
        for(Department d : departments){
            d.showDept();
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        University uni = new University("Tech University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mechanical");

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        d1.addFaculty(f1);
        d2.addFaculty(f2);

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.showUniversity();

        // Faculties still exist if dept/university deleted (Aggregation)
        f1.show();
    }
}

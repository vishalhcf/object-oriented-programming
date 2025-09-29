// Student.java
class Subject {
    String subjectName;
    int marks;

    Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }
}

class Student {
    String name;
    Subject[] subjects;

    Student(String name, Subject[] subjects) {
        this.name = name;
        this.subjects = subjects;
    }
}

class GradeCalculator {
    public String calculateGrade(Student student) {
        int total = 0;
        for (Subject sub : student.subjects) {
            total += sub.marks;
        }
        double avg = total / (double) student.subjects.length;

        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "F";
    }
}

public class SchoolResultsApp {
    public static void main(String[] args) {
        Subject[] subs = {
            new Subject("Maths", 90),
            new Subject("Science", 85)
        };

        Student student = new Student("John", subs);

        GradeCalculator gc = new GradeCalculator();
        String grade = gc.calculateGrade(student);

        System.out.println("Student: " + student.name);
        for (Subject sub : subs) {
            System.out.println(sub.subjectName + " = " + sub.marks);
        }
        System.out.println("Final Grade: " + grade);
    }
}

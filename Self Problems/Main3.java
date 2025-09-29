import java.util.*;

class Patient {
    String name;
    Patient(String name){ this.name = name; }
}

class Doctor {
    String name;
    List<Patient> patients;

    Doctor(String name){
        this.name = name;
        patients = new ArrayList<>();
    }

    void consult(Patient p){
        patients.add(p);
        System.out.println("Doctor " + name + " consulted patient " + p.name);
    }

    void showPatients(){
        System.out.println("Doctor " + name + " patients:");
        for(Patient p : patients){
            System.out.println("  - " + p.name);
        }
    }
}

class Hospital {
    String name;
    List<Doctor> doctors;
    List<Patient> patients;

    Hospital(String name){
        this.name = name;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    void addDoctor(Doctor d){ doctors.add(d); }
    void addPatient(Patient p){ patients.add(p); }

    void showHospital(){
        System.out.println("\nHospital: " + name);
        System.out.println("Doctors:");
        for(Doctor d : doctors){ System.out.println("  - " + d.name); }
        System.out.println("Patients:");
        for(Patient p : patients){ System.out.println("  - " + p.name); }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Verma");
        Doctor d2 = new Doctor("Dr. Rani");

        Patient p1 = new Patient("Vishal");
        Patient p2 = new Patient("Sonu");

        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        h.showHospital();
        d1.showPatients();
        d2.showPatients();
    }
}

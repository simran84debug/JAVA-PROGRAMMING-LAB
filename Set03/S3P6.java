
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Patient extends Person {
    String disease;
    String doctorAssigned;

    Patient(String name, int age, String disease, String doctorAssigned) {
        super(name, age);
        this.disease = disease;
        this.doctorAssigned = doctorAssigned;
    }

    void display() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Doctor Assigned: " + doctorAssigned);
    }
}

public class S3P6 {
    public static void main(String[] args) {
        Patient p = new Patient("Riya", 25, "Fever", "Dr. Sharma");

        p.display();
    }
}
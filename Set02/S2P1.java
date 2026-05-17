
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayDetails() {
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class S2P1 {
    public static void main(String[] args) {
        // Initializing the Student object
        Student s1 = new Student("Arjun Sharma", 25);

        s1.displayDetails();
    }
}
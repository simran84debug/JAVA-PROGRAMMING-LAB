
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class S2P8 {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student("Alice", 85);
        students[1] = new Student("Bob", 92);
        students[2] = new Student("Charlie", 78);

        System.out.println("All Student Details");
        for (Student s : students) {
            s.display();
        }
    }
}
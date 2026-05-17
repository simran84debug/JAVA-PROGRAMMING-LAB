
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Result extends Student {
    char grade;

    Result(String name, int marks) {
        super(name, marks);
        calculateGrade();
    }

    void calculateGrade() {
        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= 50)
            grade = 'C';
        else
            grade = 'F';
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class S3P7 {
    public static void main(String[] args) {
        Result r = new Result("Amit", 82);

        r.display();
    }
}
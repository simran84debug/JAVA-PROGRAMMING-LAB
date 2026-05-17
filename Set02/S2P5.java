
class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    void displayAverage() {
        double total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = total / marks.length;

        System.out.println("Student: " + name);
        System.out.println("Average Marks: " + average);
    }
}

public class S2P5 {
    public static void main(String[] args) {
        int[] subjectMarks = {85, 90, 78, 92, 88};

        Student student = new Student("Rahul", subjectMarks);

        // Displaying the result
        student.displayAverage();
    }
}
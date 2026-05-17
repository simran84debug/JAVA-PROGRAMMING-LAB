// The file must be named S4P1.java
class Result {
    private String studentName;
    private double marks; // Requirement: Marks cannot be directly modified (private)

    public Result(String studentName, double marks) {
        this.studentName = studentName;
        this.marks = marks;
    }

    // Requirement: External classes can view results
    public double getMarks() {
        return marks;
    }

    // Requirement: Only authorized methods (like in Admin) can update
    // No 'public' modifier means it is "package-private"
    void updateMarks(double newMarks) {
        if (newMarks >= 0 && newMarks <= 100) {
            this.marks = newMarks;
            System.out.println("Marks updated successfully to: " + newMarks);
        } else {
            System.out.println("Invalid marks value!");
        }
    }

    public String getStudentName() {
        return studentName;
    }
}

class Admin {
    // Authorized method to bridge the update
    public void authorizeUpdate(Result res, double newMarks) {
        System.out.println("Admin is authorizing update for " + res.getStudentName() + "...");
        res.updateMarks(newMarks);
    }
}

public class S4P1 {
    public static void main(String[] args) {
        // 1. Create a student result
        Result studentResult = new Result("Alice", 85.5);

        // 2. Requirement: View results (Allowed)
        System.out.println("Student: " + studentResult.getStudentName());
        System.out.println("Current Marks: " + studentResult.getMarks());

        // 3. Attempt direct modification (Blocked)
        // studentResult.marks = 95.0; // ERROR: marks has private access in Result

        // 4. Update via Admin (Authorized)
        Admin universityAdmin = new Admin();
        universityAdmin.authorizeUpdate(studentResult, 92.0);

        // 5. Verify the change
        System.out.println("Final Marks: " + studentResult.getMarks());
    }
}

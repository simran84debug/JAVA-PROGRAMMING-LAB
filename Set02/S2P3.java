
class Employee {
    String name;
    String designation;
    double salary;

    Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Employee Information");
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
    }
}

public class S2P3 {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("Amit", "Software Engineer", 75000.0);

        emp.displayInfo();
    }
}
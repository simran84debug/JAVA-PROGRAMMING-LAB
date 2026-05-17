// Base Class (Simulating company.staff package)
class Employee {
    public String name;
    protected double salary; // Protected: Visible to subclasses and same package
    int employeeId;          // Default: Visible ONLY to same package

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.employeeId = id;
    }
}

// HR Class (Same package as Employee)
class HR {
    public void updateEmployee(Employee emp) {
        // ALLOWED: Same package can access protected
        emp.salary += 5000; 
        // ALLOWED: Same package can access default
        emp.employeeId = 999; 
        System.out.println("HR: Salary and ID updated successfully for " + emp.name);
    }
}

// Manager Class (Inherits Employee)
// Even if in a different package, 'protected' would work via 'this'
class Manager extends Employee {
    public Manager(String name, double salary, int id) {
        super(name, salary, id);
    }

    public void displayManagerInfo() {
        System.out.println("Manager Accessing Own Protected Salary: " + this.salary);
        System.out.println("Manager Accessing Own Default ID: " + this.employeeId);
    }
}

// Finance Class (Simulating Different Package, No Inheritance)
class Finance {
    public void processPayroll(Employee emp) {
        System.out.println("Finance: Processing payroll for " + emp.name);
        
        // In a REAL different package:
        // 1. emp.salary would throw a COMPILER ERROR (Protected not accessible via reference)
        // 2. emp.employeeId would throw a COMPILER ERROR (Default not accessible)
        
        System.out.println("Finance: [Security Note] Cannot access private/protected fields directly in different packages.");
    }
}

// Main Execution Class
public class S4P6 {
    public static void main(String[] args) {
        // 1. Setup
        Employee worker = new Employee("John Doe", 40000, 101);
        HR hrDept = new HR();
        Manager headMgr = new Manager("Jane Smith", 90000, 001);
        Finance finDept = new Finance();

        System.out.println("INITIAL STAGE");
        System.out.println("Worker: " + worker.name + ", ID: " + worker.employeeId);

        // 2. HR Access (Same package logic)
        System.out.println("\n HR OPERATION");
        hrDept.updateEmployee(worker);

        // 3. Manager Access (Inheritance logic)
        System.out.println("\n MANAGER OPERATION");
        headMgr.displayManagerInfo();

        // 4. Finance Access (External logic)
        System.out.println("\n FINANCE OPERATION");
        finDept.processPayroll(worker);
    }
}
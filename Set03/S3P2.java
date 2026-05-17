
class Employee {
    String name;
    double baseSalary;

    // Constructor of Employee
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return baseSalary + bonus;
    }

    void display() {
        System.out.println("Manager Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class S3P2 {
    public static void main(String[] args) {
        Manager m = new Manager("Amit", 50000, 10000);

        m.display();
    }
}
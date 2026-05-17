
class Vehicle {
    String vehicleNo;
    String ownerName;

    // Constructor of Vehicle
    Vehicle(String vehicleNo, String ownerName) {
        this.vehicleNo = vehicleNo;
        this.ownerName = ownerName;
    }
}

class Car extends Vehicle {
    String model;
    String fuelType;

    Car(String vehicleNo, String ownerName, String model, String fuelType) {
        super(vehicleNo, ownerName);
        this.model = model;
        this.fuelType = fuelType;
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicleNo);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Car Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class S3P3 {
    public static void main(String[] args) {
        Car c = new Car("JK01AB1234", "Aman", "Hyundai i20", "Petrol");

        c.display();
    }
}
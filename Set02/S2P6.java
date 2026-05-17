
class Car {
    String brand;
    double price;

    Car(String brand, double price) {
        this.brand = brand; // 'this.brand' refers to the class attribute
        this.price = price; // 'this.price' refers to the class attribute
    }

    void displayDetails() {
        System.out.println("--- Car Details ---");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: $" + this.price);
    }
}

public class S2P6 {
    public static void main(String[] args) {

        Car myCar = new Car("Tesla Model 3", 45000.0);
        
        myCar.displayDetails();
    }
}
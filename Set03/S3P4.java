
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Electronics extends Product {
    int warrantyPeriod;

    Electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
        System.out.println("Final Price: " + price);
    }
}

public class S3P4 {
    public static void main(String[] args) {
        Electronics e = new Electronics("Laptop", 55000, 2);

        e.display();
    }
}
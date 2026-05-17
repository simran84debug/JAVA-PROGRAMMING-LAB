
class Order {
    int orderId;
    double amount;

    // Constructor of Order
    Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }
}

class OnlineOrder extends Order {
    double deliveryCharge;

    OnlineOrder(int orderId, double amount, double deliveryCharge) {
        super(orderId, amount);
        this.deliveryCharge = deliveryCharge;
    }

    double calculateBill() {
        return amount + deliveryCharge;
    }

    void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Amount: " + amount);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Final Bill: " + calculateBill());
    }
}

public class S3P8 {
    public static void main(String[] args) {
        OnlineOrder o = new OnlineOrder(1001, 750, 50);

        o.display();
    }
}
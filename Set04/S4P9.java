// Custom Exception for business rule violation
class ExcessiveDiscountException extends Exception {
    public ExcessiveDiscountException(String message) {
        super(message);
    }
}

class Order {
    private double price; // Private: Data safety (cannot be changed directly from outside)
    private String productName;

    public Order(String productName, double initialPrice) {
        this.productName = productName;
        this.price = initialPrice;
    }

    // Public method: Controlled access to modify internal data
    public void applyDiscount(double discountPercentage) throws ExcessiveDiscountException {
        System.out.println("Attempting to apply " + discountPercentage + "% discount on " + productName);
        
        // Validation Logic
        if (discountPercentage > 50) {
            throw new ExcessiveDiscountException("Security Alert: Discount of " + discountPercentage + "% exceeds the 50% limit!");
        }

        // Only this internal method can modify the private price
        double savings = price * (discountPercentage / 100);
        this.price -= savings;
        
        System.out.println("Success! New price: $" + String.format("%.2f", price));
    }

    public double getPrice() {
        return price;
    }
}

public class S4P9 {
    public static void main(String[] args) {
        Order myOrder = new Order("Gaming Laptop", 1200.00);

        // Scenario 1: Valid Discount
        try {
            myOrder.applyDiscount(20);
        } catch (ExcessiveDiscountException e) {
            System.out.println(e.getMessage());
        }


        // Scenario 2: Invalid (Excessive) Discount
        try {
            myOrder.applyDiscount(75);
        } catch (ExcessiveDiscountException e) {
            // This will execute
            System.out.println(e.getMessage());
        }

        System.out.println("\nFinal Order Price: $" + myOrder.getPrice());
    }
}
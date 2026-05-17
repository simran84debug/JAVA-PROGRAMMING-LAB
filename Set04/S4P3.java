import java.util.Scanner;
import java.util.InputMismatchException;

// 1. Define Custom Exceptions
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class S4P3 {
    public static void main(String[] args) {
        double balance = 5000.00; // Initial simulated balance
        Scanner scanner = new Scanner(System.in);

        System.out.println("ATM Withdrawal System");
        System.out.println("Current Balance: $" + balance);
        System.out.print("Enter amount to withdraw: ");

        try {
            // 2. Capture and validate input type
            double amount = scanner.nextDouble();

            // 3. Logic-based exception throwing
            if (amount < 0) {
                throw new InvalidAmountException("Error: You cannot withdraw a negative amount.");
            }
            
            if (amount > balance) {
                throw new InsufficientFundsException("Error: Insufficient funds. You only have $" + balance);
            }

            // 4. Processing the transaction
            balance -= amount;
            System.out.println("Success! Please collect your cash.");
            System.out.println("Remaining Balance: $" + balance);

        } catch (InputMismatchException e) {
            // Handles non-numeric inputs (e.g., entering "abc")
            System.out.println("Error: Invalid input. Please enter a numeric value.");
        } catch (InvalidAmountException e) {
            // Handles negative number input
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            // Handles amounts exceeding the balance
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Generic catch-all for any other unforeseen errors
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Ensure resources are closed
            scanner.close();
            System.out.println("Thank you for using our ATM.");
        }
    }
}
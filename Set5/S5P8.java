import java.util.Scanner;
public class S5P8 {
    static double balance = 1000.0;
    

    public static void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        
        

        try {
            withdraw(1200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
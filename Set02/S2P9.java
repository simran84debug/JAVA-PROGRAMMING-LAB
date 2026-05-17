
class BankAccount {
    String accountHolderName;
    double balance;

    BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        displayBalance();
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }
}

public class S2P9 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Amit", 1500.0);
        
        account.displayBalance();
        
        account.deposit(500.0);
    }
}
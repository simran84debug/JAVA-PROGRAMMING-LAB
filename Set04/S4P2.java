// All classes in this file are in the same default package
class BankAccount {
    // 1. Hidden (Private): Only accessible inside this class
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // 2. Default (No modifier): Accessible by any class in this file
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // 3. Public: Accessible everywhere
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // 4. Protected: Accessible by subclasses (even in other packages)
    protected double getInternalBalance() {
        return balance;
    }
}

// Subclass
class PremiumAccount extends BankAccount {
    public PremiumAccount(double initialBalance) {
        super(initialBalance);
    }

    public void applyBonus() {
        // Uses protected method from parent
        double bal = getInternalBalance(); 
        System.out.println("Applying premium bonus for balance: " + bal);
    }
}

public class S4P2 {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount(1000.0);

        // Works (Public)
        myAcc.checkBalance();

        // BLOCKED: balance is private (This line would cause a compile error)
        // myAcc.balance = 5000; 

        // WORKS in a single file: because they share the same package.
        // In a real multi-package project, this would be blocked.
        myAcc.withdraw(100);

        PremiumAccount premium = new PremiumAccount(2000.0);
        premium.applyBonus();
    }
}
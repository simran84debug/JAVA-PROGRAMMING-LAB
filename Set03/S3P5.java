
class Account {
    int accNo;
    double balance;

    // Constructor of Account
    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Amount: " + calculateInterest());
    }
}

public class S3P5 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(10101, 50000, 5);

        s.display();
    }
}
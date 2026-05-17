
class Recharge {
    String mobileNumber;
    double planAmount;

    // Constructor
    Recharge(String mobileNumber, double planAmount) {
        this.mobileNumber = mobileNumber;
        this.planAmount = planAmount;
    }
}

class DataRecharge extends Recharge {
    String dataLimit;

    DataRecharge(String mobileNumber, double planAmount, String dataLimit) {
        super(mobileNumber, planAmount);
        this.dataLimit = dataLimit;
    }

    void display() {
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Plan Amount: " + planAmount);
        System.out.println("Data Limit: " + dataLimit);
        System.out.println("Benefits: Unlimited Calls, SMS, and " + dataLimit + " Data per day");
    }
}

public class S3P10 {
    public static void main(String[] args) {
        DataRecharge d = new DataRecharge("9123456780", 399, "2GB/day");

        d.display();
    }
}

class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void displayArea() {
        double area = length * width;
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Calculated Area: " + area);
    }
}

public class S2P2 {
    public static void main(String[] args) {
        // Initializing the Rectangle object with values
        Rectangle rect = new Rectangle(10.5, 5.0);
        
        // Calculating and displaying the area
        rect.displayArea();
    }
}
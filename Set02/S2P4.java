
class Book {
    String title;
    double price;

    Book() {
        this.title = "Unknown Title";
        this.price = 0.0;
    }

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Price: $" + price);
    }
}

public class S2P4 {
    public static void main(String[] args) {
        // Using default constructor
        Book book1 = new Book();
        System.out.println("Details for Book 1 (Default):");
        book1.displayDetails();

        // Using parameterized constructor
        Book book2 = new Book("Java Programming", 550.0);
        System.out.println("Details for Book 2 (Parameterized):");
        book2.displayDetails();
    }
}
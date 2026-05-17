
class Book {
    String title;
    String author;

    // Constructor of Book
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class IssuedBook extends Book {
    String issueDate;
    String returnDate;

    IssuedBook(String title, String author, String issueDate, String returnDate) {
        super(title, author);   // calling parent constructor
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Return Date: " + returnDate);
    }
}

public class S3P9 {
    public static void main(String[] args) {
        IssuedBook book = new IssuedBook(
            "The Alchemist",
            "Paulo Coelho",
            "09-05-2026",
            "16-05-2026"
        );

        book.display();
    }
}
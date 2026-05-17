// Custom Exception for business logic
class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }
}

class Book {
    private String title;
    private int copiesAvailable; // Private: Prevent direct modification

    public Book(String title, int initialCopies) {
        this.title = title;
        this.copiesAvailable = initialCopies;
    }

    // Method to handle issuing logic
    public void issueBook() throws BookUnavailableException {
        System.out.println("Requesting to issue: " + title);
        
        if (copiesAvailable <= 0) {
            throw new BookUnavailableException("Error: All copies of '" + title + "' are currently out.");
        }

        copiesAvailable--;
        System.out.println("Success! Book issued. Copies left: " + copiesAvailable);
    }

    // Method to handle return logic
    public void returnBook() {
        copiesAvailable++;
        System.out.println("Book returned: " + title + ". New total copies: " + copiesAvailable);
    }

    // Public getter to check status without allowing modification
    public int getCopiesAvailable() {
        return copiesAvailable;
    }
}

public class S4P10 {
    public static void main(String[] args) {
        // Initialize book with 2 copies
        Book javaBook = new Book("Effective Java", 2);

        try {
            javaBook.issueBook(); // Attempt 1: Success (1 left)
            javaBook.issueBook(); // Attempt 2: Success (0 left)
            javaBook.issueBook(); // Attempt 3: Should fail
        } catch (BookUnavailableException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n PROCESSING A RETURN");
        javaBook.returnBook(); // Adds 1 copy back

        try {
            System.out.println("Re-attempting issue after return...");
            javaBook.issueBook(); // Should succeed now
        } catch (BookUnavailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
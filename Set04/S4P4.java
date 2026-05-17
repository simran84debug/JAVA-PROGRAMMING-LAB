import java.util.Scanner;

// 1. Define Custom Exceptions
class InvalidNameException extends Exception {
    public InvalidNameException(String message) { super(message); }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) { super(message); }
}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) { super(message); }
}

public class S4P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("ONLINE REGISTRATION FPRM");

            // Name Validation
            System.out.print("Enter Name: ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                throw new InvalidNameException("Error: Name field cannot be empty.");
            }

            // Age Validation
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(scanner.nextLine()); // Using parse to avoid scanner issues
            if (age < 18) {
                throw new InvalidAgeException("Error: You must be at least 18 years old to register.");
            }

            // Email Validation
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            if (!email.contains("@")) {
                throw new InvalidEmailException("Error: Invalid email format (missing '@').");
            }

            // If all checks pass
            System.out.println("\nRegistration Successful!");
            System.out.println("Welcome, " + name + "!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a valid number.");
        } catch (InvalidNameException | InvalidAgeException | InvalidEmailException e) {
            // Using a single block for custom exceptions, or separate ones if unique logic is needed
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Form session closed.");
        }
    }
}
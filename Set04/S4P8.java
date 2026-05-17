import java.util.Scanner;

// Custom Exception for security lockout
class AccountLockedException extends Exception {
    public AccountLockedException(String message) {
        super(message);
    }
}

// Custom Exception for wrong credentials
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class S4P8 {
    public static void main(String[] args) {
        String correctPassword = "Admin@123";
        int maxAttempts = 3;
        int attemptsMade = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("SECURE LOGIN SYSTEM");

        while (attemptsMade < maxAttempts) {
            try {
                System.out.print("Enter Password (Attempt " + (attemptsMade + 1) + "): ");
                String input = scanner.nextLine();

                if (!input.equals(correctPassword)) {
                    attemptsMade++;
                    
                    // If this was the last attempt, throw the Locked exception
                    if (attemptsMade == maxAttempts) {
                        throw new AccountLockedException("Error: Too many failed attempts. Your account is LOCKED.");
                    }
                    
                    // Otherwise, throw a standard wrong input exception
                    throw new InvalidCredentialsException("Error: Incorrect password. " + (maxAttempts - attemptsMade) + " attempts remaining.");
                }

                // If password is correct
                System.out.println("Login Successful! Welcome to the dashboard.");
                break; // Exit the loop

            } catch (InvalidCredentialsException e) {
                System.out.println(e.getMessage());
            } catch (AccountLockedException e) {
                System.out.println(e.getMessage());
                // No break needed here as the loop will naturally end due to attemptsMade
            }
        }

        scanner.close();
        System.out.println("Session Ended.");
    }
}
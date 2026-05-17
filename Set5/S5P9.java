import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}


public class S5P9 {

  public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8 ) {
            throw new InvalidPasswordException("Password must be at least 8 characters long and contain a digit.");
        }
    }
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter password:");
   String pass = sc.nextLine();
   try{
    validatePassword(pass);
    System.out.print("Password is valid");
   }
    catch(InvalidPasswordException e){
     System.out.print(e.getMessage());
    }}


    
}
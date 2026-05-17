import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class S4P7 {
    public static void main(String[] args) {
        // We simulate a file that likely doesn't exist to trigger the exception
        File file = new File("my_data.txt");
        FileReader fr = null;

        try {
            System.out.println("Attempting to open file: " + file.getName());
            
            // This will throw FileNotFoundException if the file is missing
            fr = new FileReader(file);
            
            System.out.println("File opened successfully!");
            // Logic to read file would go here...

        } catch (FileNotFoundException e) {
            // Handle the specific case where the file is missing
            System.out.println("Error: The file '" + file.getName() + "' was not found.");
        } catch (Exception e) {
            // Handle any other unexpected errors
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // This block ALWAYS runs, regardless of whether an exception occurred
            System.out.println("Closing file resources...");
            try {
                if (fr != null) {
                    fr.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error while closing the file: " + e.getMessage());
            }
        }
    }
}
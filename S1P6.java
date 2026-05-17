import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S1P6 {

    public static void main(String[] args) {

        // Create a list of strings
        List<String> names = Arrays.asList("Aman", "Rahul", "Priya", "Neha", "Karan");

        System.out.println("Original List: " + names);
        // Reverse the list
        Collections.reverse(names);

        // Print reversed list
        System.out.println("Reversed List: " + names);
    }
}
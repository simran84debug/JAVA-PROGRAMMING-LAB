import java.util.Arrays;
import java.util.List;

public class S1P3 {

    public static void main(String[] args) {

        // Create a list of strings
        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Orange");

        // Element to search
        String target = "Mango";

        // Check if the list contains the target
        if (fruits.contains(target)) {
            System.out.println(target + " is present in the list.");
        } else {
            System.out.println(target + " is not present in the list.");
        }
    }
}

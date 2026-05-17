import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S1P5 {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> numbers = Arrays.asList(10, 25, 3, 78, 56, 1, 45);

        // Find maximum and minimum values
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        // Print results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S1P7 {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(45, 12, 78, 3, 56, 23)
        );

        // Sort in ascending order
        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers);

        // Sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers);
    }
}

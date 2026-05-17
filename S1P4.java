import java.util.Arrays;
import java.util.List;

public class S1P4 {

    public static void main(String[] args) {

        // Array of Integers
        Integer[] numbersArray = {1, 2, 3, 4, 5};

        // Convert Array to List
        List<Integer> numbersList = Arrays.asList(numbersArray);

        System.out.println("List: " + numbersList);

        // Convert List back to Array
        Integer[] newArray = numbersList.toArray(new Integer[0]);

        // Print the new array
        System.out.println("Array: " + Arrays.toString(newArray));
    }
}
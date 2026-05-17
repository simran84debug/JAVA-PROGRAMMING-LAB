import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S1P9 {

    // Method to find common elements
    public static List<Integer> findCommonElements(
            List<Integer> list1,
            List<Integer> list2) {

        // Create a copy of list1
        List<Integer> common = new ArrayList<>(list1);

        // Keep only common elements
        common.retainAll(list2);

        return common;
    }

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        System.out.println(findCommonElements(list1, list2));
    }
}
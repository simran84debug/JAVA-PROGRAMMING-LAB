import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1P8 {

    // Method to count frequencies
    public static Map<String, Integer> countFrequencies(List<String> words) {

        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count each word
        for (String word : words) {
            frequencyMap.put(word,
                    frequencyMap.getOrDefault(word, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList(
                "apple", "banana", "apple",
                "orange", "banana", "apple"
        );

        System.out.println(countFrequencies(words));
    }
}
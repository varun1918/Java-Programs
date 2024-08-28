import java.util.*;

public class FreqofChar {
    public static void main(String[] args) {
        // Input list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 8, 9, 10);

        // Map to store frequency of each integer
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // List of integers sorted by their frequency and first appearance
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        sortedNumbers.sort((a, b) -> {
            int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
            if (freqCompare == 0) {
                return Integer.compare(numbers.indexOf(a), numbers.indexOf(b));
            }
            return freqCompare;
        });

        // Output the result
        sortedNumbers.forEach(num -> System.out.print(num + " "));
    }
}


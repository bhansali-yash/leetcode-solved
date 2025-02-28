import java.util.Optional;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstIndex = -1, secondIndex = -1;
        for (int i = 0; i < numbers.length - 1; i++) {
            int firstNum = numbers[i]; // Store actual value
            
            // Search for second number
            Optional<Integer> result = binarySearch(numbers, target - firstNum, i + 1, numbers.length - 1);
            if (result.isPresent()) {
                firstIndex = i + 1; // Convert to 1-based index
                secondIndex = result.get() + 1; // Convert to 1-based index
                break;
            }
        }
        return new int[]{firstIndex, secondIndex};
    }

    public Optional<Integer> binarySearch(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) return Optional.of(m);
            else if (arr[m] < target) s = m + 1;
            else e = m - 1;
        }
        return Optional.empty();
    }
}

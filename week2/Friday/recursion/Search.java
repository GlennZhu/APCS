package APCS.APCS.week2.Friday.recursion;

/**
 * Created by ziliangzhu on 12/26/14.
 */
public class Search {
    /**
     * Search target
     * @param input
     * @return the index of the target; -1 if not found
     */
    public int linearSearch(int[] input, int target) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == target) return i;
        }
        return -1;
    }

    public int binarySearch(int[] sortedInput, int target) {
        return binarySearch(sortedInput, target, 0, sortedInput.length - 1);
    }

    private int binarySearch(int[] sortedInput, int target,
                            int start, int end) {
        // Base case
        if (start > end) return -1;

//        int midIndex = (start + end) / 2;
//        2100000000 + 2100000010
        int midIndex = start + (end - start) / 2;
        int midValue = sortedInput[midIndex];
        if (midValue == target) return midIndex;
        else if (midValue > target) return binarySearch(sortedInput, target,
                start, midIndex - 1);
        else return binarySearch(sortedInput, target, midIndex + 1, end);
    }
}

// 0, 10
// 0, 5
// 3, 5
// 3, 4
// 3, 3
// 3, 2 // not exist
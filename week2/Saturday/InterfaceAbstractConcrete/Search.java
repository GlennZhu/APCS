package APCS.APCS.week2.Saturday.InterfaceAbstractConcrete;

/**
 * Created by ziliangzhu on 12/27/14.
 */
public class Search {
    public int binarySearch(int[] data, int target) {
        return binarySearch(data, target, 0, data.length - 1);
    }

    private int binarySearch(int[] data, int target, int start, int end) {
        // Base case
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        int midValue = data[mid];
        if (midValue == target) return mid;
        // Inductive
        else if (midValue > target) {
            return binarySearch(data, target, start, mid - 1);
        } else {
            return binarySearch(data, target, mid + 1, end);
        }
    }
}

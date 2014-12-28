package APCS.APCS.week2.Saturday.recursion;

/**
 * Created by ziliangzhu on 12/27/14.
 */
public class Palindrome {
    public boolean isPalindrome(char[] input, int start, int end) {
        // Base case
        if (start >= end) return true;
        if (input[start] != input[end]) return false;
        // Inductive
        return isPalindrome(input, start + 1, end - 1);
    }
}

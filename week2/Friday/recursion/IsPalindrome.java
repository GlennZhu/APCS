package APCS.APCS.week2.Friday.recursion;

/**
 * Created by ziliangzhu on 12/26/14.
 */
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    private boolean isPalindrome(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        else return isPalindrome(s, start + 1, end - 1);
    }
}

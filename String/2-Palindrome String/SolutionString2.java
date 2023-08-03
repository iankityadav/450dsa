/**
 * Solution of question 2 of String
 */
public class SolutionString2 {
    public static void main(String[] args) {
        System.out.println(palindrome("ANNA"));
    }

    /**
     * Check whether a string is palindrome or not.
     * 
     * @param s String
     * @return Return true if the String is palindrome otherwise false
     */
    public static boolean palindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
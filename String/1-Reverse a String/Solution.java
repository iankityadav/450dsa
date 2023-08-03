public class Solution {
    public static void main(String[] args) {
        char[] s = "string".toCharArray();
        reverseString(s);
        System.out.println(s);
    }

    /**
     * Reverse the string
     * @param s String
     */
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i <= j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}

/**
 * Solution of question 7 in series of 450 DSA sheet.
 * 
 * <p>
 * Contains the method which performs the cyclic rotation of one in an integer
 * array
 * </p>
 * 
 * @author iankityadav
 */
public class Solution {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        rotate(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Rotates the array by one clockwise cycle
     * 
     * @param arr Array of Integer
     * @param n Length of array
     */
    public static void rotate(int arr[], int n) {
        int a = arr[n - 1];
        for (int i = n - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = a;
    }
}

/**
 * Solution of question 5 in series of 450 DSA sheet.
 * 
 * <p>
 * Two pointers approach where we simply take two variables like left and right
 * which hold the 0 and N-1 indexes.
 * </p>
 * 
 * @author iankityadav
 */
public class Solution {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9, -11 };
        move(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    /**
     * Moves all the negative integers to the start of the array and positive
     * numbers at the end.
     * 
     * @param arr   Array of integers
     * @param left  Pointer for start
     * @param right Pointer for end
     */
    public static void move(int arr[], int left, int right) {
        while (left < right) {
            if (arr[left] < 0)
                left++;
            else if (arr[right] > 0)
                right--;
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}

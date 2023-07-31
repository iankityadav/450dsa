import java.util.Arrays;

/**
 * Solution of question 9 in series of 450 DSA sheet.
 *
 * <p>
 * Consider the array <code>[a,c,d,b]</code> to minimize the difference.
 * </p>
 * Maximum difference between the height of towers assuming the array is sorted
 * is <code>b-a</code>.
 * To minimise the difference add <code>k</code> to the <code>c</code> and
 * subract <code>k</code> from <code>d</code> and greedily store the minimum
 * difference.
 * <p>
 *
 * @author iankityadav
 */
public class SolutionArray9 {
    public static void main(String[] args) {
        int arr[] = { 7, 4, 8, 8, 8, 9 };
        int k = 6;
        int result = getMinDiff(arr, arr.length, k);
        System.out.println(result);
    }

    /**
     * Adds value <code>k</code> to the shortest and subtracts from highest
     * tower.
     * Updates the min and max towers.
     * Hence finds the minimum difference between the heights of towers using greedy
     * approach.
     * <p>
     * When considering the case where <code>arr[i] &lt; k</code> because the height
     * of the tower can’t be
     * negative then to neglect that case, put the condition
     * <code>if(!(arr[i] &lt; k))</code> inside the
     * <code>for</code> loop containing the approach inside it.
     * </p>
     *
     * @param arr Array of elements
     * @param n   Length of <code>arr</code>
     * @param k   Value which can be added or subtracted to minimize the differnce
     * @return Returns the difference of height of towers after minimizing.
     */
    public static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int tempMin = arr[0], tempMax = arr[n - 1], ans = tempMax - tempMin;
        for (int i = 1; i < n; i++) {
            tempMin = Math.min(arr[i] - k, arr[0] + k);
            tempMax = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            ans = Math.min(ans, tempMax - tempMin);
        }
        return ans;
    }
}

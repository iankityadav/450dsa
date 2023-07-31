/**
 * Solution of question 8 in series of 450 DSA sheet.
 *
 * <p>
 * Finds the maximum sum using Kadane's algorithm
 * </p>
 *
 * @author iankityadav
 */
public class SolutionArray8 {
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int result = maxSubArraySum(a);
        System.out.println(result);
    }

    /**
     * Checks for the sum of elements in array until it is not less than 0 and holds
     * the maximum sum
     * for that subarray and continues the process to the end of array.
     *
     * @param a Array of integers
     * @return Returns the maximum sum of contiguous subarray
     */
    public static int maxSubArraySum(int a[]) {
        int maxSum = Integer.MIN_VALUE, curSum = 0;
        for (int i : a) {
            curSum += i;
            if (curSum > maxSum)
                maxSum = curSum;
            if (curSum < 0)
                curSum = 0;
        }
        return maxSum;
    }
}

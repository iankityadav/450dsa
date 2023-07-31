/***
 * Solution of question 2 in series of 450 DSA sheet.
 *
 * <p>
 * Compared in pairs for minimum number of comparisons
 * 
 * @author iankityadav
 */
public class SolutionArray2 {
    public static void main(String[] args) {
        int arr[] = { 123, 234, 987, 456, 345, 100 };
        Pair res = getMinMax(arr, arr.length);
        System.out.println(res.min + ", " + res.max);
    }

    /**
     * Utility class to produce output in pair
     */
    static class Pair {
        int min;
        int max;
    }

    /**
     * Accepts the array and returns maximum and minimum element in array
     * by comparing in O(n) time with O(1) auxiliary space
     * 
     * @param arr
     * @param n
     * @return Pair of min and max elements in given array
     */
    public static Pair getMinMax(int[] arr, int n) {
        Pair result = new Pair();
        int i;
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                result.max = arr[0];
                result.min = arr[1];
            } else {
                result.min = arr[0];
                result.max = arr[1];
            }
            i = 2;
        } else {
            result.max = arr[0];
            result.min = arr[0];
            i = 1;
        }

        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > result.max)
                    result.max = arr[i];
                if (arr[i + 1] < result.min)
                    result.min = arr[i + 1];
            } else {
                if (arr[i + 1] > result.max)
                    result.max = arr[i + 1];
                if (arr[i] < result.min)
                    result.min = arr[i];
            }
            i += 2;
        }
        return result;
    }
}

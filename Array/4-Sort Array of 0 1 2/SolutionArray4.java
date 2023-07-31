/***
 * Solution of question 4 in series of 450 DSA sheet.
 *
 * <p>
 * Sort the array having 0s, 1s and 2s
 *
 * @author iankityadav
 */
public class SolutionArray4 {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 0, 2, 2, 1, 1, 0, 1, 2, 1, 0, 0 };
        sort012(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    /**
     * Changes the array by adding 0s at front, 2s at last and 1s in between them to
     * sort the array of such elements.
     *
     * @param arr Array of 0s 1s and 2s
     * @param n   Size of Array
     */
    public static void sort012(int arr[], int n) {
        int low = 0, high = n - 1, mid = 0, temp = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}

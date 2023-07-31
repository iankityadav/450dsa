import java.util.Arrays;

/**
 * Solution of question 12 of arrays
 */
public class SolutionArray12 {
    public static void main(String[] args) {

    }

    /**
     * Merges the array by swapping the elements which is smaller in second array
     * than the element in first array
     *
     * @param arr1 First Array
     * @param arr2 Second Array
     * @param n    Length of <code>arr1</code>
     * @param m    Length of <code>arr2</code>
     */
    public void merge(int arr1[], int arr2[], int n, int m) {
        int i = n - 1;
        int j = 0;

        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            } else
                break;
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

    }
}

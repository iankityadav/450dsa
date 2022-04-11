/***
 * Solution of question 4 in series of 450 DSA sheet.
 * 
 * <p>
 * Sort the array having 0s, 1s and 2s
 * 
 * @author iankityadav
 */
public class Solution {
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
     * @param n Size of Array
     */
    public static void sort012(int arr[], int n) {
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }
        i = 0;
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }
        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }
        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }
    }
}

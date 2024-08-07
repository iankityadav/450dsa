import java.util.Arrays;

public class SolutionArray15 {
    public static void main(String[] args) {
        long arr[] = { 5, 3, 9, 1, 3, 2, 7, 4 };
        long ans = inversionCount(arr, arr.length);
        System.out.println(ans);
    }

    static long inversionCount(long arr[], int n) {
        return countInv(arr, 0, n - 1);
    }

    static long countInv(long arr[], int l, int r) {
        long res = 0;
        if (l < r) {
            int m = (l + r) / 2;
            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, r);
            res += mergeAndCount(arr, l, m, r);
        }
        return res;
    }

    private static long mergeAndCount(long arr[], int l, int m, int r) {
        long[] left = Arrays.copyOfRange(arr, l, m + 1);
        long[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
        long n1 = left.length, n2 = right.length;
        long res = 0;
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                res += (n1 - i);
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
        return res;
    }
}

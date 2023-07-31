import java.util.*;

/***
 * Solution of question 3 in series of 450 DSA sheet.
 *
 * <p>
 * To find the kth smallest and largest element in an array
 *
 * @author iankityadav
 */
public class SolutionArray3 {
    public static void main(String[] args) {
        int arr[] = { 44, 2, 4, 5, 7, 20, 18 };
        int k = 4;
        int ks = kthSmallest(arr, 0, arr.length - 1, k);
        int kl = kthLargest(arr, 0, arr.length - 1, k);
        System.out.println(ks + ", " + kl);
    }

    /**
     * Uses priority queue of max heap to find the kth smallest element in an array
     *
     * @param arr Array of Integer elements
     * @param l   left
     * @param r   right
     * @param k
     * @return Returns the kth smallest integer in <code>arr</code>
     */
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = l; i <= r; i++) {
            pq.add(arr[i]);
            if (pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }

    /**
     * Uses priority queue of min heap to find the kth largest element in an array
     *
     * @param arr Array of Integer elements
     * @param l   left
     * @param r   right
     * @param k
     * @return Returns the kth largest integer in <code>arr</code>
     */
    public static int kthLargest(int[] arr, int l, int r, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = l; i <= r; i++) {
            pq.add(arr[i]);
            if (pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }
}
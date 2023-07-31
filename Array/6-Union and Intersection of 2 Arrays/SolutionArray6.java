import java.util.HashSet;

/**
 * Solution of question 6 in series of 450 DSA sheet.
 *
 * <p>
 * Contains methods to find the number of elements in union and intersection of
 * two arrays
 * </p>
 *
 * @author iankityadav
 */
public class SolutionArray6 {
    public static void main(String[] args) {
        int a[] = { 1, 4, 6, 7, 9, 10, 11 };
        int b[] = { 3, 1, 5, 7, 8 };
        int u = union(a, a.length, b, b.length);
        int i = intersection(a, a.length, b, b.length);
        System.out.println("Union: " + u + ", Intersection: " + i);
    }

    /**
     *
     * @param a First Array
     * @param n Length of first array
     * @param b Second Array
     * @param m Length of second array
     * @return returns the length of the union of the array
     */
    public static int union(int a[], int n, int b[], int m) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++)
            hs.add(a[i]);
        for (int i = 0; i < m; i++)
            hs.add(b[i]);
        return hs.size();
    }

    /**
     *
     * @param a First Array
     * @param n Length of first array
     * @param b Second Array
     * @param m Length of second array
     * @return returns the length of the intersection of the array
     */
    public static int intersection(int a[], int n, int b[], int m) {
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++)
            hs.add(a[i]);
        for (int i = 0; i < m; i++)
            if (hs.contains(b[i]))
                count++;
        return count;
    }
}

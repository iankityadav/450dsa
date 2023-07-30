import java.util.Arrays;

/**
 * Solution of question 14 of arrays
 */
public class SolutionArray14 {
    public static void main(String[] args) {
        int[][] ans = new SolutionArray14().overlappedInterval(new int[][] { { 1, 4 }, { 0, 4 } });
        for (int[] i : ans) {
            System.out.println(Arrays.toString(i));
        }
    }

    /**
     * Takes a 2D array of inetrvals and sort them.
     * Check for each interval if the ending of the previous element is greater than
     * current element start then get the maximum ending for that interval.
     * 
     * @param intervals
     * @return array after accumulating intervals
     */
    public int[][] overlappedInterval(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);

        int j = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[j][1] >= intervals[i][0]) {
                intervals[j][1] = Math.max(intervals[i][1], intervals[j][1]);
            } else {
                j++;
                intervals[j] = intervals[i];
            }
        }
        return Arrays.copyOf(intervals, j + 1);
    }
}

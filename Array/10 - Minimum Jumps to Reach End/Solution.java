public class Solution {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int result = minJumps(arr, arr.length);
        System.out.println(result);
    }

    public static int minJumps(int[] arr, int n) {
        if (arr.length <= 1)
            return 0;
        if (arr[0] == 0)
            return -1;

        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;

        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length - 1) {
                return jump;
            }
            maxReach = Math.max(maxReach, i + arr[i]);
            step--;
            if (step == 0) {
                jump++;
                if (i >= maxReach) {
                    return -1;
                }
                step = maxReach - i;
            }
        }
        return -1;
    }
}

/**
 * Solution of question 1 of bit manipulation
 * 
 * @author iankityadav
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(countSetBits(6));
    }

    /**
     * Shift bits and do Binary AND operation.
     * AND returns 1 only when both are set bits hence masking it with 1.
     * @param n
     * @return
     */
    public static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    /**
     * Uses Brian Kernighan’s Algorithm
     * <p>
     * Subtracting 1 from a decimal number flips all the bits after the rightmost
     * set bit(which is 1) including the rightmost set bit
     * </p>
     * 
     * @param n
     * @return
     */
    public static int countSetBitsBK(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}

/***
 * Solution of question 1 in series of 450 DSA sheet.
 *
 * <p>
 * Provided with String and Integer array
 * 
 * @author iankityadav ;
 */
public class SolutionArray1 {
    public static void main(String[] args) {
        String str = "Reverse a string or Array";
        String[] arr = str.split("");
        int n = arr.length - 1;
        reverseArray(arr, 0, n);
        printArray(arr, arr.length);

        Integer[] arrInt = { 0, 1, 2, 3, 4, 5 };
        reverseArray(arrInt, 0, arrInt.length - 1);
        printArray(arrInt, arrInt.length);
    }

    /**
     * Reverse the provided array of objects iteratively by swapping the elements
     * from start to end.
     * 
     * @param <T>
     * @param arr
     * @param start
     * @param end
     */
    public static <T> void reverseArray(T arr[], int start, int end) {
        T temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Prints the array of elements with comma as separator except array of string.
     * <p>
     * Prints the string in one line without separator.
     * 
     * @param <T>
     * @param arr
     * @param size
     */
    private static <T> void printArray(T arr[], int size) {
        int i = 0;
        if (arr[0] instanceof String) {
            for (T t : arr)
                System.out.print(t);
            System.out.println();
        } else {
            for (T t : arr) {
                i++;
                if (i == size)
                    System.out.println(t);
                else
                    System.out.print(t + ", ");
            }
        }
    }
}
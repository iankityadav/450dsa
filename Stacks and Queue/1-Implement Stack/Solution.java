/**
 * Solution of question 1 of stack
 */
public class Solution {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
    }

}

/**
 * Stack implemented using array
 */
class Stack {
    int top;
    int arr[] = new int[1000];

    Stack() {
        top = -1;
    }

    /**
     * Function to push an integer into the stack.
     */
    void push(int a) {
        arr[++top] = a;
    }

    /**
     * Function to remove an item from top of the stack.
     */
    int pop() {
        if (top == -1)
            return -1;
        return arr[top--];
    }
}

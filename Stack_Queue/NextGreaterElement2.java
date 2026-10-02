import java.util.*;
class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] nge = new int[n];
        int ind = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            int ele = arr[i];
            while (!stack.isEmpty() && stack.peek() <= ele)
                stack.pop();
            if (stack.isEmpty()) {
                //Checking from starting (Clockwise)
                for (int j = 0; j < i; j++) {
                    if (arr[j] > ele) {
                        stack.push(arr[j]);
                        nge[ind--] = arr[j];
                        break;
                    }
                }
                //If stack is still empty then nge not found
                if (stack.isEmpty())
                    nge[ind--] = -1;
            } else {
                nge[ind--] = stack.peek();
            }
            stack.push(ele);
        }
        return nge;
    }
}


//LightPole Approach, Monotonic stack increasing order m store karega elements from top to bottom

import java.util.*;
class Solution {
    public int[] nextLargerElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        int ind = n - 1;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            int ele = arr[i];
            while (!stack.isEmpty() && stack.peek() <= ele)
                stack.pop();
            if (stack.isEmpty())
                nge[ind--] = -1;
            else
                nge[ind--] = stack.peek();
            stack.push(ele);
        }
        return nge;
    }
}
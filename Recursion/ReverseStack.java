package Recursion;

//[1,2,3,4,5] -> [5,4,3,2,1]

import java.util.*;

public class ReverseStack {
    //take out all elements until empty, insert ours then push all the popped ones
    static void insertAtBottom(Stack<Integer> st, int ele) {
        Integer n = null;
        if (!st.isEmpty())
            n = st.pop();
        if (n == null) {
            st.push(ele);
            return;
        } else
            insertAtBottom(st, ele);
        st.push(n);
    }

    public void reverseStack(Stack<Integer> st) {
        if (st.isEmpty())
            return;
        int ele = st.pop();
        //reach the last element using this
        reverseStack(st);
        //from last element upto the first one (on top) keep on inserting at bottom of the stack
        insertAtBottom(st, ele);
    }
}
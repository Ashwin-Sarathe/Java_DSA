

import java.util.*;
public class ValidParentheses {
    Deque<Character> stack = new ArrayDeque<>();

    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if (stack.isEmpty())
                return false;
            else {
                if (c == ')' && stack.peek() == '(')
                    stack.pop();
                else if (c == '}' && stack.peek() == '{')
                    stack.pop();
                else if (c == ']' && stack.peek() == '[')
                    stack.pop();
                else
                    return false;
            }
        }
        if (stack.isEmpty())
            return true;
        return false;
    }
}

package Recursion;

import java.util.*;
class GenerateParentheses {
    static void solve(StringBuilder temp, List<String> result, int o, int c, int n) {
        // base case
        if (o > n || c > o)
            return;
        if (temp.length() == 2 * n) {
            result.add(temp.toString());
            return;
        }
        
        temp.append('(');
        solve(temp, result, o + 1, c, n);
        temp.deleteCharAt(temp.length() - 1);
        temp.append(')');
        solve(temp, result, o, c + 1, n);
        temp.deleteCharAt(temp.length() - 1);

    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        solve(temp, result, 0, 0, n);
        return result;
    }
}
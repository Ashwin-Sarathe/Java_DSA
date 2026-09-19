//Print whole Pascal Triangle till the given row
import java.util.*;
class PascalTriangle3 {
    static List<Integer> generateRows(int rowInd) {
        int ans = 1;
        List<Integer> list = new ArrayList<>();
        list.add(ans);
        for (int i = 1; i < rowInd; i++) {
            ans = ans * (rowInd - i);
            ans = ans / i;
            list.add(ans);
        }
        return list;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            list.add(generateRows(i));
        }
        return list;
    }
}
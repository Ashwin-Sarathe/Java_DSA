
//Print the element at some row and column of Pascal's triangle

public class PascalTriangle1 {
    public static void main(String[] args) {
        int row = 5, col = 3;
        long ans = 1;
        for (int i = 0; i < col - 1; i++) {
            ans = ans * (row - 1 - i);
            ans = ans / (i + 1);
        }
        System.out.println(ans);
    }
}
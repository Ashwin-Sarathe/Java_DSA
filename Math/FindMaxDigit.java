package Math;


public class FindMaxDigit {
    public int largestDigit(int n) {
        int max = -1;
        if (n == 0)
            return 0;
        while (n != 0) {
            int a = n % 10;
            max = Math.max(max, a);
            n = n / 10;
        }
        return max;
    }
}
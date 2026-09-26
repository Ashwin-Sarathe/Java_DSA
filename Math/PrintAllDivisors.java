package Math;

//Give all divisors of "n" in sorted order in an array.
public class PrintAllDivisors {
    public int[] divisors(int n) {
        int i = 1, cnt = 0;
        if (n == 1)
            return new int[] { 1 };
        double sq = Math.sqrt(n);
        while (i < sq) {
            if (n % i == 0)
                cnt += 2;
            i++;
        }
        if (i == sq)
            cnt++;
        int[] ans = new int[cnt];
        i = 1;
        int p = 0, q = cnt - 1;
        while (i < sq) {
            if (n % i == 0) {
                ans[p++] = i;
                ans[q--] = n / i;
            }
            i++;
        }
        if (p == q)
            ans[p] = i;
        return ans;
    }
}
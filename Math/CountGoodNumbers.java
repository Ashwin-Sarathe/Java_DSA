package Math;
//Even indices can only have Even digits (0,2,4,6,8) and Odd ones can only have prime nos i.e. 2,3,5,7
//IMP : Take mod at all places where u do multiplication

public class CountGoodNumbers {
    static final long M = 1000000007L;

    //Binary Exponentiation
    static long pow(long a, long b) {
        if (b == 0)
            return 1;
        if (b == 1)
            return a;

        long half = pow(a, b / 2);
        long result = (half * half) % M;
        if (b % 2 != 0) {
            result = (result * a) % M;
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        long ans = (pow(5, even) * pow(4, odd)) % M;
        return (int) (ans % M);
    }
}

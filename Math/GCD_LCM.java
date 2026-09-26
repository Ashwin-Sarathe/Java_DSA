package Math;

//find gcd and lcm of two nos

public class GCD_LCM {
    // GCD or HCF using Optimized Euclidean Algorithm by Checking Remainder
    static int solve(int a, int b){
        return (b==0) ? a : solve(b, a%b);
    }
    public static void main(String[] args) {
        int a=20, b=98;
        System.out.println("GCD : " + solve(a,b));
        int lcm = (a*b)/solve(a,b);
        System.out.println("LCM : " + lcm);
    }
}

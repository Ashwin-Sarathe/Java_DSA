package Math;

public class CountOddDigits {
    public int countOddDigit(int n) {
        int ans=0;
        while(n!=0){
            int a = n%10;
            if(a%2!=0) ans++;
            n=n/10;
        }
        return ans;
    }
}

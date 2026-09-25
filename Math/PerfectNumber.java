package Math;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        //O(N/2) Approach

        // int sum=0, i=1;
        // while(i <= num/2){
        // if(num%i == 0) sum += i;
        // i++;
        // }
        // if(sum==num) return true;
        // else return false;

        //O(sqrt(num)) Approach
        
        // edge case
        if (num == 1)
            return false;

        // already taking 1 for all nos
        int sum = 1, i = 2;
        while (i < Math.sqrt(num)) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
            i++;
        }
        if (sum == num)
            return true;
        else
            return false;
    }
}

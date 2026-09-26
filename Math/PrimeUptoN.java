package Math;

import java.util.Arrays;

//Return no of prime nos strictly lesser than the given number
public class PrimeUptoN {
        public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);
        int num=0;
        for(int i=2; i*i<n; i++){
            if(arr[i]){
                for(int j=i*i; j<n; j+=i) arr[j]=false;
            }
        }
        for(int i=2; i<n; i++){
            if(arr[i]) num++;
        }
        return num;
    }  
}
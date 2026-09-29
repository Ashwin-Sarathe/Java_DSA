package Binary_Search;

//Calc min no of bananas that koko should eat in an hr to finish all of them in the given hrs "h"
//BS on Answers

public class KokoEatingBananas {
        static long check(int[] piles, int mid, int n) {
        long ans = 0;
        for (int i = 0; i < n; i++) {
            //ceiling integer division
            ans += (piles[i] - 1L) / mid + 1;
        }
        return ans;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0, min = 1;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, piles[i]);
        }
        if (h == n)
            return max;
        while (min <= max) {
            //overflow safe mid calculation
            int mid = min + (max-min) / 2;
            if (check(piles, mid, n) > h)
                min = mid + 1;
            else
                max = mid - 1;
        }
        return min;
    }
}

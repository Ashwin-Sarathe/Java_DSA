package Hashing;

import java.util.HashMap;
import java.util.Map;

//Return the second highest occuring element
//If not exists then return -1
//If multiple such elements exist then return smallest one

public class SecondHighest {
    public int secondMostFrequentElement(int[] nums) {
     int n=nums.length;
     Map<Integer, Integer> map = new HashMap<>();
     int max=-1, max2=-1;
     for(int i=0; i<n; i++){
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
     }
     for(int i=0; i<n; i++){
        int val=map.get(nums[i]);
        if(val>max){max2=max; max=val;}
        else if(val<max && val>max2){max2=val;}
     }
     if(max2==max || max2==-1) return -1;
     int n1=Integer.MAX_VALUE;
     for(int i=0; i<n; i++){
        int val = map.get(nums[i]);
        if(val==max2){
            n1 = Math.min(n1, nums[i]);
        }
     }
     return n1;
    }
}
//Find the elements which appear more than n/3 times
//Only 2 elements can appear more than n/3 times not more than that.
//Use Boyer-Moore Voting Algo 2 times 

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0, cnt2=0;
        int ele1=0, ele2=0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(cnt1==0 && ele2!=nums[i]) {ele1=nums[i]; cnt1++;}
            else if(cnt2==0 && ele1!=nums[i]) {ele2=nums[i]; cnt2++;}
            else if(nums[i]==ele1) cnt1++;
            else if(nums[i]==ele2) cnt2++;
            else {cnt1--; cnt2--;}
            
        }
        List<Integer> list=new ArrayList<>();
        //manual check
        int count = (int)Math.floor(n/3);
        int c1=0, c2=0;
        for(int i=0; i<n; i++){
            if(nums[i]==ele1) c1++;
            else if(nums[i]==ele2) c2++;
        }
        if(c1>count)list.add(ele1);
        if(c2>count)list.add(ele2);
        return list;
    }
}

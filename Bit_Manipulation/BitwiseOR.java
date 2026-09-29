package Bit_Manipulation;

import java.util.*;

//Do bitwise operation on given array on A[i] and A[i+1] and store result in another list

class BitwiseOR {
    public List<Integer> orArray(List<Integer> A) {
        // User code goes here
        List<Integer> ans=new ArrayList<>();
        int n=A.size();
        for(int i=0; i<n-1; i++){
            ans.add(A.get(i)|A.get(i+1));
        }
        return ans;
    }
}
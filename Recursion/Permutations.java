package Recursion;

//Leetcode 46 : Permutations
//Generate all permuations of a given array
//eg: [1,2,3] : 123,132,213,231,312,321

import java.util.*;
public class Permutations {

    //Adding elements in temp, O(N * N!)
    public static void solve(List<List<Integer>> list, List<Integer> temp, int[] nums) {

        for (int j = 0; j < nums.length; j++) {
            if (temp.size() == nums.length) {
                list.add(new ArrayList<>(temp));
                return;
            }
            if (temp.contains(nums[j]))
                continue;
            temp.add(nums[j]);
            solve(list, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(list, temp, nums);
        return list;
    }
}

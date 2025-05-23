//Given an array arr[]. The task is to find the largest element and return it.
class Solution {
    public static int largest(int[] arr) {
        
        int max = 0;
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }
}

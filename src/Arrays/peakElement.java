//Given an array arr[] where no two adjacent elements are same, find the index of a peak element. 
//An element is considered to be a peak if it is greater than its adjacent elements (if they exist). 
//If there are multiple peak elements, return index of any one of them. 
//The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".
class Solution {
    public static int peakElement(int[] arr) {
        int n = arr.length;
        if(n<2)
            return 0;
        else if(arr[1]<arr[0])
            return 0;
        else if(arr[n-1]>arr[n-2])
            return n-1;
        for(int i=1; i<n-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }
        return -1;
    }
 }

//Given an array of positive integers arr[], return the second largest element from the array. 
//If the second largest element doesn't exist then return -1.
//Note: The second largest element should not be equal to the largest element.

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=0;
        int max2=-1;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==max)
                continue;
            if(arr[i]>max2)
                max2=arr[i];
        }
        
        return max2;
    }
}

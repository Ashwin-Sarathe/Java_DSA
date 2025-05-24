//Given an array arr. Your task is to find the minimum and maximum elements in the array.
//Note: Return a Pair that contains two elements the first one will be a minimum element and the second will be a maximum.

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Her
        int min=arr[0], max=arr[0];
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        return new Pair(min, max);
    }
}

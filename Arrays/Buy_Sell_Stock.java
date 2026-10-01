class Buy_Sell_Stock {
    public int stockBuySell(int[] arr, int n) {
       int buy=arr[0], profit=0, max=0;
       for(int i=0; i<n; i++){
        profit = arr[i]-buy;
        if(profit < 0) buy=arr[i];
        max = Math.max(max, profit);
       }
       return max;
    }
}
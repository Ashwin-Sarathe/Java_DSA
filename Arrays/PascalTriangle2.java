// Print the given row of Pascal's triangle

public class PascalTriangle2{
    static long ncr(int n, int r){
        n=n-1; r=r-1;
        long ans=1;
        for(int i=0; i<r; i++){
            ans = ans*(n-i);
            ans = ans/(i+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        //generating each element using nCr, time -> O(n*r) 
        // int row=5;
        // for(int i=1; i<=row; i++){
        //     System.out.println(ncr(5,i));
        // }

        //time -> O(n) approach
        int row=5;
        long ans=1;
        System.out.println(ans);
        for(int i=1; i<row; i++){
            ans=ans*(row-i);
            ans=ans/(i);
            System.out.println(ans);
        }
    }
}
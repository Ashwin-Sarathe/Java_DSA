package Random;
//Reverse Degree of String
//Sum of each char's reverse position + position in string (1-indexed) 

public class ReverseDegree {
    static int solve(String s){
        int n=s.length();
        int sum=0;
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            int org = 27-(c-'a'+1);
            sum += (i+1)*org;
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "abc";
        int ans = solve(s);
        System.out.println(ans);
    }
}

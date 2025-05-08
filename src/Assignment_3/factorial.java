//Factorial using Recursion (which is the most confusing topic in CS acc to me)

package Assignment_3;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n==1)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        int result = fact(x);
        System.out.println(result);
    }
}

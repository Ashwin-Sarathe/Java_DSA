package Assignment_4;

import java.util.Scanner;

public class num_palindrome {
    public static int numOfDigits(int n){
        int i=0;
        do{
            int x=n/10;
            i++;
            n=x;
        }while(n!=0);
        return i;
    }
    public static int palindrome(int num){
        int n=num;
        int nod = numOfDigits(n), revNum=0;
        for(int i=nod-1;i>=0;i--){
            int m = n%10;
            n= n/10;
            double s = Math.pow(10,i);
            revNum += (s*m);
        }
        if(revNum==num)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result= palindrome(n);
        if(result==1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

//to find armstrong number between two given 
package Assignment_2;
import java.util.Scanner;
public class armstrong {
    static int digits(int n){
        int i=0, q=0;
        while(n!=0){
            q=n%10;
            n=n/10;
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();
        int q, d, sum=0;
        for(int i=a; i<=b; i++) {
            d = digits(i);
            int n = i;
            sum=0;
            while (n != 0) {
                q = n % 10;
                n = n / 10;
                sum += Math.pow(q, d);
            }
            if (sum == i) {
                System.out.println("The Armstrong numbers found are:");
                System.out.println(i);
            }
        }
    }

}

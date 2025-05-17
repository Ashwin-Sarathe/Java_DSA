//Calculate Average of N numbers
package Assignment_3;
import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=999, i=0, sum=0;
        do {
            System.out.println("Enter number (Enter 0 if done): ");
            x=sc.nextInt();
            sum+=x;
            i++;
        }while(x!=0);
        int avg = sum/i;
        System.out.println("Average = "+avg);
    }
}

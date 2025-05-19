// Program to read numbers from user until 0 is entered.
// Calculates sum of negative numbers, positive even numbers, and positive odd numbers.
// Also finds min, max, total count, and average.
// Repeats the process based on user choice.

package Assignment_3;
import java.util.Scanner;
public class num {
    public static void func(){
        Scanner sc = new Scanner(System.in);
        int n = 99, sumn=0, sumpe=0, sumpo=0, i=0;
        int high=0, low=1, sum=0;
        do {
            System.out.println("Enter a number (Enter 0 to STOP): ");
            n = sc.nextInt();
            if(n<0)
                sumn+=n;
            else{
                if(n%2==0)
                    sumpe+=n;
                else
                    sumpo+=n;
            }
            if(n>high)
                high=n;
            if(n<low)
                low=n;
            sum+=n;
            i++;
        }while(n!=0);
        int avg = sum/i;
        System.out.println("Sum of -ve nos: " +sumn);
        System.out.println("Sum of +ve even nos: "+sumpe);
        System.out.println("Sum of +ve odd nos: "+sumpo);
        System.out.printf("Average: %.2f\n", avg);
        System.out.println("Total nos: "+i);
        System.out.println("Highest no: "+high);
        System.out.println("Lowest no: "+low);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        do{
            func();
            System.out.println("Do u want to repeat this for another set of nos(1/0): ");
            choice = sc.nextInt();
        }while(choice == 1);
    }
}

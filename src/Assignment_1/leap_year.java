//A year is a leap year when:
//1. It is divisible by 4 and not by 100
//2. It is divisible by 400 (for century years like 1900)
package Assignment_1;
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = sc.nextInt();
        if(year%4==0 && year%100!=0)
            System.out.println(year+" is a Leap Year");
        else if(year%400==0)
            System.out.println(year+" is a Leap Year");
        else
            System.out.println(year+" is not a Leap Year");
    }
}

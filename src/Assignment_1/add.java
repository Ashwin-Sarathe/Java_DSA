//We can take two numbers as input at the same time using next method
//Using printf method we can use format specifiers of C

package Assignment_1;
import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("Sum of %d and %d is: %d", a, b, a+b);
    }
}

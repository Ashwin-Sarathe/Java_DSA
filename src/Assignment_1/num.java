//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package Assignment_1;
import java.util.Objects;
import java.util.Scanner;
public class num {
    public static void main(String[] args) {
        String i;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter any no or 'x' to print their sum: ");
            i = sc.next();
            if(Objects.equals(i, "x"))
                break;
            else
                sum = sum + Integer.parseInt(i);
        }
        System.out.println(sum);
    }
}

//Multiplication table of a Given number using both recursion and loop
//To use a method in main method without its object we have to use "static" keyword
package Assignment_1;
import java.util.Scanner;

public class table {
    //Recursion
    static void t(int n, int i){
        if(i>10) {
            return;
        }
        else {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
            t(n, i+1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter method: \n0 => Recursion\n1 => Loop");
        int c = sc.nextInt();
        if(c==0)
            t(n, 1);
        if(c==1) {
            int i = 1;
            while (i <= 10) {
                System.out.printf("%d * %d = %d\n", n, i, n * i);
                i++;
            }
        }
    }
}

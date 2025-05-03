package Assignment_2;

import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number:");
        int n = sc.nextInt();
        String s = (n%2==0)?"Even number":"Odd number";
        System.out.println(s);
    }
}

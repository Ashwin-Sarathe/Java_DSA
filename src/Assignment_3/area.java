package Assignment_3;
import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter equal side:");
        float a = sc.nextFloat();
        float b=a;
        System.out.println("Enter 3rd side:");
        float c= sc.nextFloat();
        float s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the Triangle is: "+area+" sq. units");
    }
}

//Takes number of customers and name and units consumed by each customer and
// then generates Bill Summary for each customer
package Assignment_3;

import java.util.Scanner;

class Customer {
    String name;
    int units, rate;
    Scanner sc = new Scanner(System.in);

    Customer() {
        System.out.println("Enter Customer Name: ");
        name = sc.next();
        System.out.println("Enter units consumed: ");
        units = sc.nextInt();
        if (units <= 100)
            rate = 5;
        else if (units <= 200) {
            rate = 6;
        } else if (units <= 300) {
            rate = 7;
        } else
            rate = 8;
    }
}

public class electricity_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of customers: ");
        int n = sc.nextInt();
        Customer[] cust = new Customer[n];
        for (int i = 0; i < n; i++) {
            cust[i] = new Customer();
            System.out.println("Bill Details for " + cust[i].name + " are:");
            System.out.println("Slab Rate -> Rs." + cust[i].units * cust[i].rate);
            System.out.println("Fixed Meter Charge -> Rs.50");
            int x = (cust[i].units * cust[i].rate) + 50;
            System.out.println("Total Charge -> Rs." + x);
            System.out.println("GST -> 18%");
            x += x * 0.18;
            System.out.println("Gross Total Bill: Rs." + x);
        }
    }
}

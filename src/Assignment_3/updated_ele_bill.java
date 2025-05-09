//Takes number of customers and name and units consumed by each customer and
// then generates Bill Summary for each customer
//This is updated logic which implements encapsulation in a better way
package Assignment_3;
import java.util.Scanner;
class Customers {
    String name;
    int units, rate;
    int slabRate, newSlabRate;
    double totalBill;
    Scanner sc = new Scanner(System.in);
    void readCustomerData(){
        System.out.println("Enter Customer Name: ");
        name = sc.next();
        System.out.println("Enter units consumed: ");
        units = sc.nextInt();
    }
    public void calcRate(){
        if (units <= 100)
            rate = 5;
        else if (units <= 200) {
            rate = 6;
        } else if (units <= 300) {
            rate = 7;
        } else
            rate = 8;
    }
    public void calcSlabRate(){
        calcRate();
        slabRate = units*rate;
        newSlabRate = slabRate + 50;
    }
    public void total(){
        calcSlabRate();
        double gst = 0.18;
        totalBill = newSlabRate+(newSlabRate*gst);
    }
    public void printBill(){
        total();
        System.out.println("Bill Details for "+name+" are:");
        System.out.println("Slab Rate -> Rs." + slabRate);
        System.out.println("Fixed Meter Charge -> Rs.50");
        System.out.println("Total Charge -> Rs." + newSlabRate);
        System.out.println("GST -> 18%");
        System.out.println("Gross Total Bill: Rs." + totalBill);
    }
}

public class updated_ele_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of customers: ");
        int n = sc.nextInt();
        Customers[] cust = new Customers[n];
        for (int i = 0; i < n; i++) {
            cust[i] = new Customers();
            cust[i].readCustomerData();
            cust[i].printBill();
        }
    }
}

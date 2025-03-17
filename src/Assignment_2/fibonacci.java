package Assignment_2;

public class fibonacci {
    public static void fib(int n){
        int a=0,b=1,i=0;
        System.out.print(a+"\t");
        System.out.print(b+"\t");
        while(i<n-2){
            int sum = a + b;
            System.out.print(sum + "\t");
            i++;
            a = b;
            b = sum;
        }
    }
    public static void main(String[] args) {
        fib(7);
    }
}

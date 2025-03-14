//I have only done using Naive approaches for now
package Assignment_1;

public class Hcf_lcm {
    public static void main(String[] args) {
        int a = 16, b=20;
        int hcf=0;
        for(int i=1; i<=a || i<=b; i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF: "+ hcf);
        int lcm = (a*b)/hcf;
        System.out.println("LCM: "+lcm);
    }
}

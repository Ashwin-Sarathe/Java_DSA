package Math;

//Find Power when exponent is very large using Binary Exponentiation

/*
    pow(a, b) = pow(a, b/2) ^ 2 if b is even
    pow(a, b) = a * pow(a, b/2) ^ 2 if b is odd

*/

public class BinaryExponentiation {
    static int pow(int a, int b){
        if(b==0) return 1;
        if(b==1) return a;

        int half = pow(a, b/2);
        int result = half * half;
        if(b%2 != 0 ){
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 10)); 
    }
}

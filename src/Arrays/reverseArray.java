//Using for loop to reverse the array
package Arrays;
import java.util.Arrays;
public class reverseArray {
    public static void revArray(int[] a){
        int n=a.length-1;
        int[] b = new int[n+1];
        for(int i=0; i<=n; i++){
            b[i]=a[n-i];
        }
        System.out.println(Arrays.toString(b));
    }
    public static void main(String[] args) {
        int[] a = {2,4,61,5,17,1,43};
        revArray(a);
    }
}

//Using swapping logic to reverse the array
package Arrays;
import java.util.Arrays;
public class reverseArray2 {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] a = {2,4,61,5,17,1,43};
        int[] b = reverse(a);
        System.out.println(Arrays.toString(b));
    }
}

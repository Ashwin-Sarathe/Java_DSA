package Arrays;
import java.util.Arrays;
public class swapElements {
    //Using 3rd variable logic
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //Without Using 3rd variable logic
    public static void swap2(int[] arr, int i, int j){
        arr[i] = arr[i]+arr[j];
        arr[j] = arr[i]-arr[j];
        arr[i] -= arr[j];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        //swap(arr, 1, 4);
        swap2(arr, 1, 4);
        System.out.println(Arrays.toString(arr));
    }
}


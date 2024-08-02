import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // kiểu dữ liệu nguyên thủy
        int[] arr1 = {1,2,3,4,5};

        // Copy
        int[] arr1_a = arr1;
        arr1_a[0] = 100;

        System.out.println("Mảng 1: "+ Arrays.toString(arr1));
        System.out.println("Mảng 1 a: "+ Arrays.toString(arr1_a));


        // Clone
        int[] arr2 = {1,2,3,4,5};
        int[] arr2_a = arr2.clone();
        arr2_a[0] = 100;
        System.out.println("Mảng 2: "+ Arrays.toString(arr2));
        System.out.println("Mảng 2 a: "+ Arrays.toString(arr2_a));


        // System.arrayCopy
        int[] arr3 = {1,2,3,4,5};
        int[] arr3_a = new int[arr3.length];
        System.arraycopy(arr3, 0, arr3_a,0,arr3.length);
        arr3_a[0] = 100;
        System.out.println("Mảng 3: "+ Arrays.toString(arr3));
        System.out.println("Mảng 3 a: "+ Arrays.toString(arr3_a));
    }
}
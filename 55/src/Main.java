import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,4,3,2,5,6};
        int[] b = new int[10];

        System.out.println("Mang ban dau:");
        System.out.println(Arrays.toString(a));

        // Ham sap xep tang dan
        System.out.println("Mang sap xep tang dan:");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        // Ham tim kiem
        System.out.println(Arrays.binarySearch(a,2));
        System.out.println(Arrays.binarySearch(b,9));

        // Ham dien gia tri
        System.out.println("Dien gia tri:");
        Arrays.fill(b, 5);
        System.out.println(Arrays.toString(b));

        // Ham sap xep giam dan
        System.out.println("Mang sap xep giam dan:");
        Arrays.sort(a);
        a = reverse(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] reverse(int[] x){
        int[] rs = new int[x.length];
        int index = 0;
        for(int i = x.length-1; i >= 0; i--){
            rs[index] = x[i];
            index++;
        }
        return rs;
    }
}
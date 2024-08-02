import java.lang.Integer;
public class _10_Convert_type_data {
    public static void main(String[] args) {
        int a = 100;
        int b = 2;

        // Ép kiểu ngầm định
        float c = a;
        float d = b;

        // Ép kiểu tường minh
        float e = 3.5f;
        float f = 9.5f;
        double g = (double) e;
        double h = (double) f;

        // Ép kiểu giữa biến nguyên thủy và đối tượng
        int x = new Integer(32);
        System.out.println("x = " + x);


        System.out.println("a = " + c);
        System.out.println("b = " + d);
        System.out.println("g = " + g);
        System.out.println("h = " + h);

    }
}

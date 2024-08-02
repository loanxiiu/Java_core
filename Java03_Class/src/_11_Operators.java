import java.util.Scanner;

public class _11_Operators {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        b = sc.nextInt();
        int tong = a+b;
        System.out.println(a + " + " + b + " = " + tong);
        int hieu = a-b;
        System.out.println(a + " - " + b + " = " + hieu);
        float thuong = (float) a/b;
        System.out.println(a + " / " + b + " = " + thuong);
        int nhan = a*b;
        System.out.println(a + " * " + b + " = " + nhan);
        int du = a%b;
        System.out.println(a + " % " + b + " = " + du);
    }
}

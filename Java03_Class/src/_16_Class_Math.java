import java.util.Scanner;

public class _16_Class_Math {
    public static void main(String[] args) {
        double r, dienTich, chuVi;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r= ");
        r = input.nextDouble();

        chuVi = 2 * Math.PI * r;
        System.out.println("The chuVi is: " + Math.round(chuVi*100.0)/100.0);
        dienTich = Math.PI * Math.pow(r, 2);
        System.out.println("The dienTich is: " + Math.round(dienTich));

//        double a, b;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the first number a= ");
//        a = sc.nextDouble();
//        System.out.print("Enter the second number b= ");
//        b = sc.nextDouble();
//
//        System.out.println("|a| = "+ Math.abs(a));
//        System.out.println("min(a,b) = " + Math.min(a, b));
//        System.out.println("max(a,b) = " + Math.max(a, b));
//        System.out.println("ceil(a) = " + Math.ceil(a));
//        System.out.println("floor(a) = " + Math.floor(a));
//        System.out.println("sqrt(a) = " + Math.sqrt(a));
//        System.out.println("pow(a,b) = " + Math.pow(a,b));
    }
}

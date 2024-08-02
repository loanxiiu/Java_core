import java.util.Scanner;

public class _14_Comparison_Operators_Logical_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter an integer a = ");
        a = sc.nextInt();
        System.out.print("Enter an integer b = ");
        b = sc.nextInt();
        System.out.println(a + " == "+ b + ": " + (a == b));
        System.out.println(a + " != "+ b + ": " + (a != b));
        System.out.println(a + " > "+ b + ": " + (a > b));
        System.out.println(a + " >= "+ b + ": " + (a >= b));
        System.out.println(a + " < "+ b + ": " + (a < b));
        System.out.println(a + " <= "+ b + ": " + (a <= b));
        System.out.println("----------------");
        System.out.println("Ca hai so la so chan: "+ (a%2 == 0 &&  b%2 == 0));
        System.out.println("Co it nhat mot so chan: "+ (a%2 == 0 || b%2 == 0));

    }
}

import java.util.Scanner;

public class _13_Assignment_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer a = ");
        float a = sc.nextFloat();
        System.out.println("a = " + a);

        a += 3;
        System.out.println("a += 3: " + a);
        a -= 2;
        System.out.println("a -= 2: " + a);
        a *= 2;
        System.out.println("a *= 2: " + a);
        a /= 3;
        System.out.println("a /= 3: " + a);
        a %= 3;
        System.out.println("a %= 3: " + a);
    }
}

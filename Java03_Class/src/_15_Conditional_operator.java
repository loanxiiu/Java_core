import java.util.Scanner;

public class _15_Conditional_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer a= ");
        int a = sc.nextInt();
        String result = (a%2==0) ? "So chan" : "So le";
        System.out.println("a la "+ result);
    }
}

import java.util.Scanner;

public class _25_do_while {
    public static void main(String[] args) {
        int n=1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhập n>0");
            n=sc.nextInt();
        }while(n<=0);
    }
}

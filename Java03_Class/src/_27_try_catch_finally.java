import java.util.InputMismatchException;
import java.util.Scanner;

public class _27_try_catch_finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        try{
            System.out.println("Nhập vào số nguyên n:");
            n = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Nhập dữ liệu không đúng");
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Giá trị nhập là: " +n);
        System.out.println("Kết thúc chương trình");
    }
}

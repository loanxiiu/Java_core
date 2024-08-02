import java.util.Scanner;

public class _23_While {
    public static void main(String[] args) {
        int x=1;
        Scanner sc = new Scanner(System.in);
        while(x!=0){
            System.out.println("Nhap x = 0 để thoát; Nhập ký tự khác để tiếp tục");
            x = sc.nextInt();
        }

        int i=0;
        while (true){
            System.out.println(i);
            i++;
        }
    }
}

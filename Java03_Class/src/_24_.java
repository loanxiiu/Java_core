import java.util.Scanner;

public class _24_ {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n>0");
        n = sc.nextInt();

//        Chia liên tục cho 2 và lấy phần dư
//        Đảo ngược chuỗi => Kết quả
//        10:2=5 dư 0
//        5:2=2 dư 1
//        2:2=1 dư 0
//        1:2=0 dư 1

        String nhiPhan = "";
        while(n>0){
            nhiPhan = (n %2) + nhiPhan;
            n = n / 2;
        }
        System.out.println("Số hệ nhị phân là: " +nhiPhan);
    }
}

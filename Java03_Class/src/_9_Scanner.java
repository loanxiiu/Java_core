import java.util.Scanner;

public class _9_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập họ và tên: ");
        String hoVaTen = sc.nextLine();

        System.out.println("Nhập mã sv: ");
        long maSinhVien = sc.nextLong();

        System.out.println("Nhap vao diem thi: ");
        float diemThi = sc.nextFloat();

        System.out.println(hoVaTen + " " + maSinhVien + " " + diemThi);
    }
}

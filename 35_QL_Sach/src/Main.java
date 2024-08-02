//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(18,7,2024);
        Ngay ngay2 = new Ngay(19,7,2024);
        Ngay ngay3 = new Ngay(20,7,2024);

        TacGia tacGia1 = new TacGia("Loan",ngay1);
        TacGia tacGia2 = new TacGia("Khang",ngay2);
        TacGia tacGia3 = new TacGia("Tung",ngay3);

        Sach sach1 = new Sach("Lap trinh java", 5000, 2024, tacGia1);
        Sach sach2 = new Sach("Lap trinh c", 5000, 2024, tacGia2);
        Sach sach3 = new Sach("Lap trinh c++", 5000, 2024, tacGia3);

        sach1.inTenSach();
        System.out.println("So NXB sach1 va  3: "+ sach1.kiemTraCungNamXuatBan(sach3));
        System.out.println("Sach1 sau khi giam 10% : "+ sach1.giaSauKhiGiam(10));
    }
}
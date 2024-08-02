//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(19,7,2024);
        Ngay ngay2 = new Ngay(20,7,2024);
        Ngay ngay3 = new Ngay(21,7,2024);

        QuocGia quocGia1 = new QuocGia("VN", "Viet Nam");
        QuocGia quocGia2 = new QuocGia("USA", "Hoa ky");
        QuocGia quocGia3 = new QuocGia("PL", "Ba Lan");

        HangSanXuat hangSanXuat1 = new HangSanXuat("ASUS", quocGia1);
        HangSanXuat hangSanXuat2 = new HangSanXuat("Macbook", quocGia2);
        HangSanXuat hangSanXuat3 = new HangSanXuat("Samsung", quocGia3);

        MayTinh mt1 = new MayTinh(hangSanXuat1,ngay1, 1500,12);
        MayTinh mt2 = new MayTinh(hangSanXuat2,ngay2, 2000,15);
        MayTinh mt3 = new MayTinh(hangSanXuat3,ngay3, 1800,15);

        System.out.println("M1 re hon M2 "+ mt1.kiemTraGiaThapHon(mt2));
        System.out.println("M2 re hon M3 "+ mt2.kiemTraGiaThapHon(mt3));

        System.out.println("Ten quoc gia sx m1 "+ mt1.layTenQuocGia());
        System.out.println("Ten quoc gia sx m2 "+ mt2.layTenQuocGia());
        System.out.println("Ten quoc gia sx m3 "+ mt3.layTenQuocGia1());
    }
}
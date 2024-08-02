//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(19,7,2024);
        Ngay ngay2 = new Ngay(20,7,2024);
        Ngay ngay3 = new Ngay(20,7,2024);

        Lop lop1 = new Lop("IT1", "CNTT");
        Lop lop2 = new Lop("M2","Marketing");
        Lop lop3 = new Lop("D3","DT");

        SinhVien sv1 = new SinhVien("001", "Tung", ngay1, 9,lop1);
        SinhVien sv2 = new SinhVien("002", "Nga", ngay2, 8,lop2);
        SinhVien sv3 = new SinhVien("003", "Huyen", ngay3, 2,lop3);

        System.out.println("SV1 thuoc khoa "+ sv1.layTenKhoa());
        System.out.println("Kiem tra thi dat SV3 "+ sv3.kiemTraThiDat());
        System.out.println("kiem tra cung ngay sinh sv1 sv2 "+ sv1.kiemTraCungNgaySinh(sv2));
        System.out.println("Kiem tra cung ngay sinh sv2 sv3 "+ sv2.kiemTraCungNgaySinh(sv3));
    }
}
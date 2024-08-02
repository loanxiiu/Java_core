//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15, 05, 2024);
        Ngay ngay2 = new Ngay(19, 07, 2024);
        Ngay ngay3 = new Ngay(25, 07, 2024);

        HangSanXuat hangSanXuat1 = new HangSanXuat("Hang A", "Viet Nam");
        HangSanXuat hangSanXuat2 = new HangSanXuat("Hang B", "My");
        HangSanXuat hangSanXuat3 = new HangSanXuat("Hang C", "Thai Lan");

        BoPhim boPhim1 = new BoPhim("Bo Gia", 2020, hangSanXuat1, 65000, ngay1);
        BoPhim boPhim2 = new BoPhim("world", 2021, hangSanXuat2, 123000, ngay2);
        BoPhim boPhim3 = new BoPhim("tor", 2022, hangSanXuat3, 60000, ngay3);

        System.out.println("SS gia phim2 re hon phim3 "+boPhim1.kiemTraGiaVeReHon(boPhim3));
        System.out.println("Ten hang san xuat phim 2 "+ boPhim2.layTenHangSanXuat());
        System.out.println("Gia BP1 sau khi giam 10%: "+ boPhim1.giaVeSauKhuyenMai(10));
    }
}
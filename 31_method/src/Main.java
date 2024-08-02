//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 1000, 1.5);
        System.out.println("Tong tien: " + hd.tinhTongTien());

        System.out.println("Kiem tra khoi luong lon hon 2kg "+ hd.kiemTraKhoiLuongLonHon(1));

        System.out.println("Kiem tra tong tien lon hon 500K: "+ hd.kiemTraTongTienLonHon500K());;

        System.out.println("Giam gia cua Hd: "+ hd.giamGia(10));

        System.out.println("Gia sau khi giam la: "+ hd.giaSauKhiGiam(10));
    }
}
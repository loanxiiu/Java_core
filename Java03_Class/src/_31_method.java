public class _31_method {

    public static class HoaDonCaPhe{
        private String tenLoaiCaPhe;
        private double giaTien1Kg;
        private double khoiLuong;

        public HoaDonCaPhe(String tenloaicaphe, double giatien1kg, double khoiluong){
            this.tenLoaiCaPhe = tenloaicaphe;
            this.giaTien1Kg = giatien1kg;
            this.khoiLuong = khoiluong;
        }

        public double tinhTongTien(){
            return this.giaTien1Kg *this.khoiLuong;
        }
    }

    public static class Program{
        public static void main(String[] args){
            HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 100, 1.5);
            System.out.println("Tong tien: " + hd.tinhTongTien());
        }
    }

}

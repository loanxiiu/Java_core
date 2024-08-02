public  class HoaDonCaPhe{
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

    public boolean kiemTraKhoiLuongLonHon(double kl){
//        if(this.khoiLuong > kl){
//            return true;
//        }
//        else {
//            return false;
//        }
        return this.khoiLuong > kl;
    }

    public boolean kiemTraTongTienLonHon500K(){
        return this.tinhTongTien() > 500;
    }

    public double giamGia(double x){
        if(tinhTongTien()>500){
            return (x/100)*this.tinhTongTien();
        }
        else return 0;
    }

    public double giaSauKhiGiam(double x){
        return this.tinhTongTien()-this.giamGia(x);
    }
}

